package mcgonigleapps.wxtutor;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *
 *               WxTutor - LessonFragment.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description: This fragment serves as the ViewPager fragment that is generated when either of the first three options
 *               are selected from the main menu.  Each lesson is broken out into "final int lessons" number of teaching steps.
 *
 */

public class LessonFragment extends Fragment {
    // Store instance variables
    private String mTitle;
    private int mParentMenu, mGrandParentMenu;
    private static final int lessons=7;
    private static final String GRANDPARENTMENU="GRANDPARENTMENU", PARENTMENU="PARENTMENU", TITLE="TITLE";

    // newInstance constructor for creating fragment that tracks which selections are made on the main and sub menus along with the lesson title
    public static LessonFragment newInstance(int parentMenu, int grandParentMenu) {
        LessonFragment fragmentFirst = new LessonFragment();
        Bundle args = new Bundle();
        args.putInt(PARENTMENU, parentMenu);
        args.putInt(GRANDPARENTMENU, grandParentMenu);
        args.putString(TITLE, getLessonTitle(grandParentMenu, parentMenu));
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    // Store instance variables based on arguments passed upon creation of this fragment
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mParentMenu = getArguments().getInt(PARENTMENU, 0);
        mGrandParentMenu = getArguments().getInt(GRANDPARENTMENU, 0);
        mTitle = getArguments().getString(TITLE);
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lesson_content, container, false);

        TextView mMainTitle = (TextView) view.findViewById(R.id.lessonTitle);

        //Change the title in the action bar to contain the lesson number and title
        mMainTitle.setText("Lesson "+ (mParentMenu+1) + " -- " + mTitle);

        // Declare all of the views used in this fragment and attach them to the views defined in the XML layout file
        TextView lessonContentTitle1=(TextView) view.findViewById(R.id.lessonContentTitle1),
                lessonContentTitle2=(TextView) view.findViewById(R.id.lessonContentTitle2),
                lessonContentTitle3=(TextView) view.findViewById(R.id.lessonContentTitle3),
                lessonContentTitle4=(TextView) view.findViewById(R.id.lessonContentTitle4),
                lessonContentTitle5=(TextView) view.findViewById(R.id.lessonContentTitle5),
                lessonContentTitle6=(TextView) view.findViewById(R.id.lessonContentTitle6),
                lessonContentTitle7=(TextView) view.findViewById(R.id.lessonContentTitle7);

        ImageView lessonImage1=(ImageView) view.findViewById(R.id.lessonImage1),
                lessonImage2=(ImageView) view.findViewById(R.id.lessonImage2),
                lessonImage3=(ImageView) view.findViewById(R.id.lessonImage3),
                lessonImage4=(ImageView) view.findViewById(R.id.lessonImage4),
                lessonImage5=(ImageView) view.findViewById(R.id.lessonImage5),
                lessonImage6=(ImageView) view.findViewById(R.id.lessonImage6),
                lessonImage7=(ImageView) view.findViewById(R.id.lessonImage7);

        TextView lessonContentText1=(TextView) view.findViewById(R.id.lessonContentText1),
                lessonContentText2=(TextView) view.findViewById(R.id.lessonContentText2),
                lessonContentText3=(TextView) view.findViewById(R.id.lessonContentText3),
                lessonContentText4=(TextView) view.findViewById(R.id.lessonContentText4),
                lessonContentText5=(TextView) view.findViewById(R.id.lessonContentText5),
                lessonContentText6=(TextView) view.findViewById(R.id.lessonContentText6),
                lessonContentText7=(TextView) view.findViewById(R.id.lessonContentText7);

        // Declare lists for each view in order to utilize/alter them based on index number rather than static variable name
        List<TextView> lessonContentTitles=new ArrayList<TextView>();
        List<TextView> lessonContentTexts=new ArrayList<TextView>();
        List<ImageView> lessonImages=new ArrayList<ImageView>();


        // Add all of the views to the lists created above
        lessonContentTitles.add(lessonContentTitle1);
            lessonContentTitles.add(lessonContentTitle2);
            lessonContentTitles.add(lessonContentTitle3);
            lessonContentTitles.add(lessonContentTitle4);
            lessonContentTitles.add(lessonContentTitle5);
            lessonContentTitles.add(lessonContentTitle6);
            lessonContentTitles.add(lessonContentTitle7);

        lessonContentTexts.add(lessonContentText1);
            lessonContentTexts.add(lessonContentText2);
            lessonContentTexts.add(lessonContentText3);
            lessonContentTexts.add(lessonContentText4);
            lessonContentTexts.add(lessonContentText5);
            lessonContentTexts.add(lessonContentText6);
            lessonContentTexts.add(lessonContentText7);

        populateData(mGrandParentMenu, mParentMenu, lessonContentTitles, lessonContentTexts, lessonImages);

        return view;
    }

    // Based on the selections made in the main and sub menus, populate the text for the titles and lessons for the current lesson
    private void populateData(int grandParentMenu, int parentMenu, List<TextView> titles, List<TextView> content, List<ImageView> images) {
        for(int lessonIterator=0; lessonIterator<lessons;lessonIterator++) {
            titles.get(lessonIterator).setText(lessonFunctions.populateLessonTitles(grandParentMenu, parentMenu, lessonIterator));
            content.get(lessonIterator).setText(lessonFunctions.populateLessonTexts(grandParentMenu, parentMenu, lessonIterator));
        }
    }

    //This function returns the lesson title based on the main and sub menu choices
    //This function is not necessary as the lessonFunctions.populateLessonTitles(int, int, int) can perform this action
    //                  It will be removed in a later iteration
    private static String getLessonTitle(int grandParentMenu, int parentMenu) {
        List<String> mTitles;
        switch (grandParentMenu) {
            case 0:
                mTitles = Arrays.asList("A Bunch of Hot Air", "Atmos. Cells", "Atmos. Lapse Rate", "Atmos. Layers", "Pressure and Gradient", "Coriolis Force", "Highs and Lows", "Convergence and Divergence");
                break;
            case 1:
                mTitles = Arrays.asList("Macroscale Features", "Long Wave Pattern", "Jet Streams", "Air Masses", "Synoptic Scale Systems", "Baroclinic Systems", "Barotropic Systems", "Mesoscale Effects");
                break;
            case 2:
                mTitles = Arrays.asList("Precipitation", "Hail", "Tornadoes", "Down Bursts", "Icing", "Turbulence", "Tropical Weather", "Space Weather");
                break;

            default:
                mTitles=Arrays.asList("Precipitation", "Hail", "Tornadoes", "Down Bursts", "Icing", "Turbulence", "Tropical Weather", "Space Weather");
                break;

        }
        return mTitles.get(parentMenu);
    }
}


