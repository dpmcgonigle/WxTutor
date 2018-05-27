package mcgonigleapps.wxtutor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

/*
 *
 *               WxTutor - MainMenuActivity.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description: This is the main menu that comes up after clicking the play button on the IntroFragment.
 *
 */


public class MainMenuActivity extends SingleFragmentActivity {

    //This is a basic function that can be used to create a new MainMenuActivity.  It is not entirely necessary as startActivity() can do this
    //without the need for this function, but it is good to have in case information needs to be passed to MainMenuActivity
    public static Intent newIntent(Context packageContext) {
        Intent intent=new Intent(packageContext, MainMenuActivity.class);
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
    //CrimeListFragment will implement the interface for the RecyclerView Crime List.
    @Override
    protected Fragment createFragment() {
        return new MainMenuFragment();
    }
}
