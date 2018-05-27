package mcgonigleapps.wxtutor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

/*
 *
 *               WxTutor - SubMenuActivity.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description: This is the sub menu that comes up after clicking either of the first three options in the main menu.
 *
 */


public class SubMenuActivity extends SingleFragmentActivity {

    private static final String PARENT_MENU_ID = "parent_menu_id";

    //This is a basic function that can be used to create a new SubMenuActivity.
    //The main menu selection is passed to this Activity in order to track the correct section that the user should be viewing
    public static Intent newIntent(Context packageContext, int parentMenu) {
        Intent intent=new Intent(packageContext, SubMenuActivity.class);
        intent.putExtra(PARENT_MENU_ID, parentMenu);
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
    //SubMenuFragment will implement the interface for the RecyclerView List.
    @Override
    protected Fragment createFragment() {

        int parentMenu = (int) getIntent().getIntExtra(PARENT_MENU_ID, 0);
        return SubMenuFragment.newInstance(parentMenu);
    }
}
