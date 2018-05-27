package mcgonigleapps.wxtutor;

/*
 *
 *               WxTutor - testAnswer.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description:  This object class is for test answers and contains not only the string, but boolean information about the answer
 *
 */

public class testAnswer {

    private String mAnswer;
    private boolean mIsTrue;
    private boolean mAlreadyDisplayed=false;

    public testAnswer(String answer, boolean isTrue) {
        mAnswer=answer;
        mIsTrue=isTrue;
    }

    public String getmAnswer() {
        return mAnswer;
    }

    public void setmAnswer(String mAnswer) {
        this.mAnswer = mAnswer;
    }

    public boolean ismIsTrue() {
        return mIsTrue;
    }

    public void setmIsTrue(boolean mIsTrue) {
        this.mIsTrue = mIsTrue;
    }

    public boolean ismAlreadyDisplayed() {
        return mAlreadyDisplayed;
    }

    public void setmAlreadyDisplayed(boolean alreadyDisplayed) {
        this.mAlreadyDisplayed = alreadyDisplayed;
    }
}
