package mcgonigleapps.wxtutor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

/*
 *
 *               WxTutor - ForecasterToolsActivity.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description: This activity will implement a single fragment to allow the user to convert between different units of measurement
 *
 */


public class ForecasterToolsActivity extends SingleFragmentActivity {

    //No information is needed to be passed to newIntent at this time
    public static Intent newIntent(Context packageContext) {
        Intent intent=new Intent(packageContext, ForecasterToolsActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hiding the title bar and tool bar for the intro Activity
//        getSupportActionBar().hide();
    }

    //createFragment is a method within the Activity class that can be overridden.
    //it is not one of the Activity Life Cycle methods (onStart, onResume, onPause, onCreate, onDestroy, onSavedStateInstance, etc)
    @Override
    protected Fragment createFragment() {
        return new ForecasterToolsFragment();
    }
}
