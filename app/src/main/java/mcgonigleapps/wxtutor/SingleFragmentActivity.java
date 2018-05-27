package mcgonigleapps.wxtutor;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import mcgonigleapps.wxtutor.R;

/*
 *
 *               WxTutor - SingleFragmentActivity.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description:  This class is used to house and implement a single fragment
 *
 */

public abstract class SingleFragmentActivity extends AppCompatActivity {

/*    ****Just in case I want to pass on information to the SingleFragmentActivity class at a later point, here is the starting framework
        public static Intent newIntent(Context packageContext) {
        Intent intent=new Intent(packageContext, MainMenuActivity.class);
        return intent;
    }*/

    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_fragment);

        FragmentManager fm=getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if(fragment==null) {
            fragment=createFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
}
