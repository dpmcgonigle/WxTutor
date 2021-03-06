package mcgonigleapps.wxtutor;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


/*
 *
 *               WxTutor - MainMenuFragment.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description: This is the main menu that comes up after clicking the play button on the IntroFragment.
 *               It implements a RecyclerView that contains views of each main menu selection.
 *
 */

public class MainMenuFragment extends Fragment {
    //Declare variables
    private RecyclerView mMenuRecyclerView;
    private MenuAdapter mAdapter;
    MediaPlayer click;
    private int itemChanged=-1;
    private static final String POSITION_INDEX="position_index";
    private static final int SUB_MENUS=3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main_menu, container, false);

        /*RecyclerView inflates all the views that are within the screen right now, and it will empty the view at the top of
        the list and inflate it as a view that may not be visible when you scroll down.  This saves on memory so as not to inflate all items*/
        mMenuRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_main_menu_container);
        mMenuRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }


    public void onResume() {
        super.onResume();
        updateUI();
    }

    //This method will update the UI with each view
    private void updateUI() {
        SingletonMainMenu singletonMainMenu=SingletonMainMenu.get(getActivity());
        List<MenuItem> menuItems = singletonMainMenu.getMenuItems();

        if(mAdapter==null) {
            mAdapter = new MenuAdapter(menuItems);
            mMenuRecyclerView.setAdapter(mAdapter);
        } else if(itemChanged>=0) {
            mAdapter.notifyItemChanged(itemChanged);
        }

    }


    private static final int TYPE_EVEN=0;
    private static final int TYPE_ODD=1;
    
    //This inner class will define the ViewHolder that will inflate and own the layout for each MenuItem
    private class MenuItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private MenuItem mMenuItem;
        private TextView mTitleTextView;
        private ImageView mLightning;

        //THis is the constructor for MenuItemHolder, which will inflate a single MenuItem to the fragment
        public MenuItemHolder(View v, ViewGroup parent) {
            super(v);
            itemView.setOnClickListener(this);

            mTitleTextView = (TextView) itemView.findViewById(R.id.mainMenuText);
            mLightning = (ImageView) itemView.findViewById(R.id.lightning_bullet_left);
        }

        public void bind(MenuItem menuItem) {
            mMenuItem=menuItem;
            mTitleTextView.setText(mMenuItem.getmTitle());
        }

        @Override
        public void onClick(View view) {
            itemChanged=getAdapterPosition();

            //These two lines play a clicky sound upon clicking of the Start Button
            click= MediaPlayer.create(getContext(), R.raw.click);
            click.start();

            //Based on the main menu selection, start the activity that the user clicks
            Intent intent;
            switch (mMenuItem.getmPointsTo()) {
                case 0:
                    intent = SubMenuActivity.newIntent(getActivity(), mMenuItem.getmPointsTo());
                    startActivity(intent);
                    break;

                case 1:
                    intent = SubMenuActivity.newIntent(getActivity(), mMenuItem.getmPointsTo());
                    startActivity(intent);
                    break;

                case 2:
                    intent = SubMenuActivity.newIntent(getActivity(), mMenuItem.getmPointsTo());
                    startActivity(intent);
                    break;

                case 3:
                    intent = ForecasterToolsActivity.newIntent(getActivity());
                    startActivity(intent);
                    break;

                case 4:
                    intent = TestActivity.newIntent(getActivity());
                    startActivity(intent);
                    break;

                case 5:
                    //Create an AlertDialog that displays pertinent information
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                    builder.setTitle("Weather Tutor About / Contact");

                    builder.setMessage("Created by Dan McGonigle 2018" +
                            "\n\n" +
                            "email: dpmcgonigle@gmail.com" +
                            "\n\n" +
                            "www.dpmcgonigle.com" +
                            "\n\n" +
                            "www.github.com/dpmcgonigle");
                    
                    builder.setNeutralButton("Ok",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.show();

                    break;

                default:
                    intent = SubMenuActivity.newIntent(getActivity(),0);
                    startActivity(intent);
                    break;
            }
        }
    }

    
/*******************************************        ADAPTER     *******************************************/
    //This inner class will serve as the adapter; sits between RecyclerVIew and data set to create ViewHolders and bind them to data
    private class MenuAdapter extends RecyclerView.Adapter<MenuItemHolder> {
        private List<MenuItem> mMenuItems;

        public MenuAdapter(List<MenuItem> menuItems) {
            mMenuItems=menuItems;
        }

        @Override
        public int getItemViewType(int position) {
            // This will change the view type depending on whether the MenuItem is Odd
            return mMenuItems.get(position).getmEven()? TYPE_ODD:TYPE_EVEN;
        }

        @Override
        public MenuItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view;
            if(viewType == TYPE_EVEN) {
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item_even, parent, false);
                return new MenuItemHolder(view, parent);
            }
            else if(viewType == TYPE_ODD) {
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item_odd, parent, false);
                return new MenuItemHolder(view, parent);
            }
//            Just in case!
            else {
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item_even, parent, false);
                return new MenuItemHolder(view, parent);
            }
        }

        @Override
        public void onBindViewHolder(MenuItemHolder holder, int position) {
            MenuItem menuItem=mMenuItems.get(position);
            /*I don't think this is needed
            if(holder.getItemViewType()==TYPE_ODD) {
                OddMenuItemHolder OddMenuItemHolder = (OddMenuItemHolder) holder;

            }*/
            holder.bind(menuItem);
        }

        @Override
        public int getItemCount() {
            return mMenuItems.size();
        }
    }

}
