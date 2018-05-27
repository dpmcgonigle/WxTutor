package mcgonigleapps.wxtutor;

import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/*
 *
 *               WxTutor - LessonPagerActivity.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description: This activity implements a FragmentPagerAdapter that will allow the user to slide back and forth between
 *               lessons.
 *
 */

public class LessonPagerActivity extends AppCompatActivity {
    private static int mGrandParentMenu, mParentMenu;

    Button nextButton, prevButton;

    //These final Strings will serve as identifiers to store and access the data passed into newIntent()
    private static final String PARENT_MENU_ID = "parent_menu_id";
    private static final String GRANDPARENT_MENU_ID = "grandparent_menu_id";

    //This is the intent that will pass the main and sub menu selections, so we can populate the lessons
    // from the sub menu selection that was clicked in the SubMenuFragment
    public static Intent newIntent(Context packageContext, int grandParentMenu, int parentMenu) {
        Intent intent=new Intent(packageContext, LessonPagerActivity.class);
        Bundle extras = new Bundle();
        extras.putInt(GRANDPARENT_MENU_ID, grandParentMenu);
        extras.putInt(PARENT_MENU_ID, parentMenu);
        intent.putExtras(extras);
        return intent;
    }

    //This is the total number of submenu selections that can be made.
    //The reason I have standardized this number across the three main lesson areas is to avoid having to create new classes for each
    //lesson area or implement further complexity into the flow control that handles this.  It worked out that the number of lesson areas worked
    static final int NUM_ITEMS = 8;

    private ViewPager mPager;
    FragmentPagerAdapter mPagerAdapter;
    int grandParentMenu, parentMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lesson_pager);

        //Store the data passed from newIntent() into member variables
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        grandParentMenu = extras.getInt(GRANDPARENT_MENU_ID);
        parentMenu = extras.getInt(PARENT_MENU_ID);

        nextButton = (Button) findViewById(R.id.next_button);
        prevButton = (Button) findViewById(R.id.prev_button);

  /* Instantiate a ViewPager and a PagerAdapter. */
        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new SlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        mPager.setCurrentItem(parentMenu);

    }

    /* My PagerAdapter class, which needs to implement getItem() and getCount() */
    public class SlidePagerAdapter extends FragmentPagerAdapter {
        public SlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
   /*
    * IMPORTANT: getItem() is called to create the current and next pager views, which is a fragment in this case
    */

            //Forward and backward buttons act as an alternative to ViewPager sliding by swipe
            nextButton.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mPager.setCurrentItem(mPager.getCurrentItem()+1, true);
                    setButtonVisibility(mPager.getCurrentItem(), prevButton, nextButton);
                }
            });

            prevButton.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mPager.setCurrentItem(mPager.getCurrentItem()-1, true);
                    setButtonVisibility(mPager.getCurrentItem(), prevButton, nextButton);
                }
            });

            //the listener for page sliding is used to determine when the forward or back buttons should be invisible.
            mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                    //This line was used for diagnosing and debugging.  It is unnecessary now, but I have left it as a reference
                    Log.d("onPageScrolled", Integer.toString(mPager.getCurrentItem()));

                    setButtonVisibility(mPager.getCurrentItem(), prevButton, nextButton);
                }

                @Override
                public void onPageSelected(int position) {
                    setButtonVisibility(mPager.getCurrentItem(), prevButton, nextButton);
                    //This line was used for diagnosing and debugging.  It is unnecessary now, but I have left it as a reference
                    Log.d("onPageSelected", Integer.toString(mPager.getCurrentItem()));

                }

                @Override
                public void onPageScrollStateChanged(int state) {
                    setButtonVisibility(mPager.getCurrentItem(), prevButton, nextButton);
                    //This line was used for diagnosing and debugging.  It is unnecessary now, but I have left it as a reference
                    Log.d("onPgScrollStateChanged", Integer.toString(mPager.getCurrentItem()));

                }
            });

            //Set the title of the lesson areas
            switch (grandParentMenu) {
                case 0:
                    setTitle("WxTutor - Atmosphere & Dynamics");
                    break;

                case 1:
                    setTitle("WxTutor - Basic Meteorology");
                    break;

                case 2:
                    setTitle("WxTutor - Wx Phenomena");
                    break;

                default:
                    setTitle("Error 404");
                    break;
            }

            //This line of code creates the fragment that will be viewed on the current ViewPager
            return LessonFragment.newInstance(position, grandParentMenu);

        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

    }

    //This item will set the back button invisible if the first item is getCurrentItem(), and the next button if getCurrentItem() is last item
    //The buttons will become visible if the above conditions are false
    private void setButtonVisibility(int currentItem, Button back, Button next) {
        if(currentItem>=(NUM_ITEMS-1)) {
            next.setVisibility(View.INVISIBLE);
        } else {
            next.setVisibility(View.VISIBLE);
        }
        if(currentItem<=0) {
            back.setVisibility(View.INVISIBLE);
        } else {
            back.setVisibility(View.VISIBLE);
        }
    }

}
