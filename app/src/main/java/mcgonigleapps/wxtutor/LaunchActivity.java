package mcgonigleapps.wxtutor;

import android.support.v4.app.Fragment;
import android.os.Bundle;

/*
 *
 *               WxTutor - LaunchActivity.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description: This is the Activity that starts when the program is run.  It extends SingleFragmentActivity.java and only
 *               implements a single fragment that serves as an intro screen.
 *
 */

public class LaunchActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//      *NO LONGER NECESSARY DUE AS STYLE/THEME TOOK CARE OF THIS
//      Hiding the title bar and tool bar for the intro Activity
//      getSupportActionBar().hide();
    }

    //createFragment is a method within the Activity class that can be overridden.
    //it is not one of the Activity Life Cycle methods (onStart, onResume, onPause, onCreate, onDestroy, onSavedStateInstance, etc)
    @Override
    protected Fragment createFragment() {
        return new IntroFragment();
    }

}
