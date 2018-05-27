package mcgonigleapps.wxtutor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/*
 *
 *               WxTutor - testQuestion.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description:  This object class is for the test question, which is utilized by the SingletonTestQuestions class.
 *               It also implements testAnswer.java, which comprise the answers to the questions.
 *
 */

public class testQuestion {

    private String mQuestion;
    private List<testAnswer> mAnswers=new ArrayList<>();
    private UUID mID;
    private boolean mIsAnswered;
    private boolean mIsAnsweredCorrectly;

    public testQuestion() {
        mID=UUID.randomUUID();

    }

    public testQuestion(String question, List<String> answers, int correctAnswer) {
        mQuestion=question;
        mID=UUID.randomUUID();

        for(int x=0;x<answers.size();x++) {
            mAnswers.add(new testAnswer(answers.get(x), (x==correctAnswer)));
        }

    }

    public String getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    public List<testAnswer> getmAnswers() {
        return mAnswers;
    }

    public void setmAnswers(List<String> answers, int correctAnswer) {

        for(int x=0;x<answers.size();x++) {
            mAnswers.add(new testAnswer(answers.get(x), (x==correctAnswer)));
        }

    }

    public testAnswer getmAnswer(int index) {
        return mAnswers.get(index);
    }

    public UUID getmID() {
        return mID;
    }

    public boolean ismIsAnswered() {
        return mIsAnswered;
    }

    public void setmIsAnswered(boolean mIsAnswered) {
        this.mIsAnswered = mIsAnswered;
    }

    public boolean ismIsAnsweredCorrectly() {
        return mIsAnsweredCorrectly;
    }

    public void setmIsAnsweredCorrectly(boolean mIsAnsweredCorrectly) {
        this.mIsAnsweredCorrectly = mIsAnsweredCorrectly;
    }
}
