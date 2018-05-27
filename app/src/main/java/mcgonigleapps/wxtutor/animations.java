package mcgonigleapps.wxtutor;

import android.content.Context;

import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

/*
 *
 *               WxTutor - animations.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description: This file handles the animation functions that are used in this program
 *               Current functions: growShrink(image)
 *
 */


public class animations {


    //This function will take an imageView and cause it to grow and shrink with specified sizes and timeframes using anim xml files
    public static void growShrink(final Context context, final ImageView image, float x1, float x2, float y1, float y2, final int duration) {

        final ScaleAnimation growAnim = new ScaleAnimation(x1, x2, y1, y2, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        final ScaleAnimation shrinkAnim = new ScaleAnimation(x2, x1, y2, y1, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);

        //duration will be the entire function duration, so half of it will be to grow and half to shrink
        growAnim.setDuration(duration/2);
        shrinkAnim.setDuration(duration/2);

        //set the animation to the passed imageView
        image.setAnimation(growAnim);
        growAnim.start();

        growAnim.setAnimationListener(new Animation.AnimationListener()
        {
            @Override
            public void onAnimationStart(Animation animation){}

            @Override
            public void onAnimationRepeat(Animation animation){}

            @Override
            public void onAnimationEnd(Animation animation)
            {
                //Once the grow is complete, shrink
                image.setAnimation(shrinkAnim);
                shrinkAnim.start();
            }
        });
        shrinkAnim.setAnimationListener(new Animation.AnimationListener()
        {
            @Override
            public void onAnimationStart(Animation animation){}

            @Override
            public void onAnimationRepeat(Animation animation){}

            @Override
            public void onAnimationEnd(Animation animation) {}
        });

        /*      Original code used to animate growing and shrinking
        Animation animationScaleUp = AnimationUtils.loadAnimation(context, R.anim.scale_up);
        Animation animationScaleDown = AnimationUtils.loadAnimation(context, R.anim.scale_down);

        AnimationSet growShrink = new AnimationSet(true);
        growShrink.addAnimation(animationScaleUp);
        growShrink.addAnimation(animationScaleDown);*/
    }

}


