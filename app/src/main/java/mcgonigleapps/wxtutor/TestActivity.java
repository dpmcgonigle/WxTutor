package mcgonigleapps.wxtutor;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;

/*
 *
 *               WxTutor - TestActivity.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description: The 20Q test for this app uses a test bank of more than 75 questions that each have 1 correct answer and
 *               8 incorrect answers associated with testQuestion objects that display questions and answers in random orders to ensure
 *               that each question will challenge the user even if they've seen the question previously.
 *               This class simply extends SingleFragmentActivity and lets TestFragment do all the work.
 *
 */

public class TestActivity extends SingleFragmentActivity {

    //This is a basic function that can be used to create a new TestActivity.  It is not entirely necessary as startActivity() can do this
    //without the need for this function, but it is good to have in case information needs to be passed
    public static Intent newIntent(Context packageContext) {
        Intent intent = new Intent(packageContext, TestActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//      *NO LONGER NECESSARY DUE AS STYLE/THEME TOOK CARE OF THIS
//      Hiding the title bar and tool bar for the intro Activity
//      getSupportActionBar().hide();
    }

    //createFragment is a method within the Activity class that can be overridden.
    //it is not one of the Activity Life Cycle methods (onStart, onResume, onPause, onCreate, onDestroy, onSavedStateInstance, etc)
    //CrimeListFragment will implement the interface for the RecyclerView Crime List.
    @Override
    protected Fragment createFragment() {
        return new TestFragment();
    }

}
