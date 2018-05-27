package mcgonigleapps.wxtutor;

import android.content.Context;

/*
 *
 *               WxTutor - SingletonTestScore.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description: This class is used in conjunction with TestFragment to display the current score.
 *               A singleton class may be overkill for this function.
 *
 */

public class SingletonTestScore {
    private int mAnswered, mAnsweredCorrectly;
    double mScore;
    private static SingletonTestScore sSingletonTestScore;

    //This is a "Singleton" class, allows only one instance of itself to be created. get() returns it if exists, creates it if not
    //Singletons are good for storing a global object that can be used across activities and fragments
    //The get() method effectively acts as a constructor for this class, as the actual constructor is private
    public static SingletonTestScore get(Context context) {
        if(sSingletonTestScore==null) {
            sSingletonTestScore=new SingletonTestScore(context);
        }
        return sSingletonTestScore;
    }

    synchronized static void resetTheInstance(Context context){
        /*Reset the singleton state as you wish. just like you reinitialized*/
        sSingletonTestScore=new SingletonTestScore(context);
    }

    //The constructor for SingletonMainMenu is private
    //The for loop generates all of the Crimes in the list, then sets each equal Crime to "solved" and each 5th Crime to "Requires Police"
    private SingletonTestScore(Context context) {
        mAnswered=0;
        mAnsweredCorrectly=0;
        mScore=0.0;
    }

    //Getters and setters
    public int getmAnswered() {
        return mAnswered;
    }

    public void setmAnswered(int mAnswered) {
        this.mAnswered = mAnswered;
    }

    public int getmAnsweredCorrectly() {
        return mAnsweredCorrectly;
    }

    public void setmAnsweredCorrectly(int mAnsweredCorrectly) {
        this.mAnsweredCorrectly = mAnsweredCorrectly;
    }

    public double getmScore() {
        updateScore();
        return mScore;
    }

    //Update the score based on the current number of answered and correctly answered questions
    private void updateScore() {
        mScore = ((double)mAnsweredCorrectly/(double)mAnswered);
    }
}
