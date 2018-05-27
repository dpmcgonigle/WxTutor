package mcgonigleapps.wxtutor;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/*
 *
 *               WxTutor - IntroFragment.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description: This is the single fragment that is implemented by LaunchActivity.java, the initial activity that starts upon
 *               running this app.  This view serves as an intro screen and there is only one option; click the play button to see
 *               the main menu.
 *
 */

public class IntroFragment extends Fragment {

    //Declare variables used for this program
    private ImageView thunderstorm, teacher, startButton;
    private TextView launcherTitle;
    MediaPlayer ring, click;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_intro, container, false);

        //These lines link the variables within this fragment to the actual XML Views in the layout files
        thunderstorm=(ImageView) view.findViewById(R.id.thunderstorm);
        teacher=(ImageView) view.findViewById(R.id.teacher);
        startButton=(ImageView) view.findViewById(R.id.start_button);
        launcherTitle=(TextView) view.findViewById(R.id.launcher_title);

        //These lines play the thunder sound upon launch of the app
        ring= MediaPlayer.create(getContext(), R.raw.thunder);
        ring.start();

        //THis will cause the Thunderstorm graphic to grow and then shrink over a 2.5 second interval upon opening the app
        animations.growShrink(getContext(), thunderstorm, 1.0f, 1.0f, 1.0f, 1.5f, 2500);

        //Set the onClick to launch the MainMenuActivity while playing a clicky sound
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //These two lines play a clicky sound upon clicking of the Start Button
                click=MediaPlayer.create(getContext(), R.raw.click);
                click.start();

                //Use MainMenuActivity's intent method to create the intent that will launch the next activity
                Intent intent = MainMenuActivity.newIntent(getContext());
                startActivity(intent);

            }
        });

        return view;
    }


}
