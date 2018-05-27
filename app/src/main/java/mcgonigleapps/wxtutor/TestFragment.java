package mcgonigleapps.wxtutor;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;
import java.util.List;
import java.util.UUID;
import java.util.Random;


/*
 *
 *               WxTutor - TestFragment.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description: The 20Q test for this app uses a test bank of more than 75 questions that each have 1 correct answer and
 *               8 incorrect answers associated with testQuestion objects that display questions and answers in random orders to ensure
 *               that each question will challenge the user even if they've seen the question previously.
 *
 */

public class TestFragment extends Fragment {

    private List<testQuestion> mTestQuestions;
    private int questionIndex=0;
    private Button nextButton, submitButton;
    private RadioGroup testRadioGroup;
    private RadioButton testRadioButton1, testRadioButton2, testRadioButton3, testRadioButton4, testRadioButton5;
    private TextView testScore, questionTitle;

    //The total number of questions that will be asked
    private final int MAX_QUESTIONS=20;

    //newInstance is used to create an instance of CrimeFragment from CrimeActivity (or wherever) that passes along the Crime UUID
    public static TestFragment newInstance(UUID questionId) {
        TestFragment fragment = new TestFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTestQuestions=SingletonTestQuestions.get(getContext()).getTestQuestions();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_test, container, false);

        testScore =(TextView) v.findViewById(R.id.testScore);
        questionTitle = (TextView) v.findViewById(R.id.questionTitle);

        testRadioGroup = (RadioGroup) v.findViewById(R.id.testAnswerGroup);
        testRadioButton1 = (RadioButton) v.findViewById(R.id.testRadioButton1);
        testRadioButton2 = (RadioButton) v.findViewById(R.id.testRadioButton2);
        testRadioButton3 = (RadioButton) v.findViewById(R.id.testRadioButton3);
        testRadioButton4 = (RadioButton) v.findViewById(R.id.testRadioButton4);
        testRadioButton5 = (RadioButton) v.findViewById(R.id.testRadioButton5);

        submitButton = (Button) v.findViewById(R.id.testSubmitButton);
        submitButton.setEnabled(false);

        nextButton=(Button) v.findViewById(R.id.test_next_button);

        updateQuestion();
        updateButtons();

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                questionIndex++;

                //Used for diagnosing and debugging.  Kept in code for reference
                Log.d("Question Index", Integer.toString(questionIndex));
                if(questionIndex>=(MAX_QUESTIONS)) {
                    // If answered all 20 questions, Reset the Singleton objects in case the user wants to take the test again
                    SingletonTestScore.resetTheInstance(getContext());
                    SingletonTestQuestions.resetTheInstance(getContext());
                    questionIndex=0;
                    Intent intent = MainMenuActivity.newIntent(getContext());
                    startActivity(intent);
                } else {
                    updateQuestion();
                    enableRadioGroup();
                    updateButtons();
                }

            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButtonId = testRadioGroup.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = (RadioButton) testRadioGroup.findViewById(selectedRadioButtonId);

                mTestQuestions.get(questionIndex).setmIsAnswered(true);

                updateButtons();

                if(checkAnsweredCorrectly(questionIndex, selectedRadioButton)) {
                    Toast.makeText(getContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    SingletonTestScore.get(getContext()).setmAnsweredCorrectly(SingletonTestScore.get(getContext()).getmAnsweredCorrectly()+1);
                }
                else {
                    Toast.makeText(getContext(), "Incorrect! Correct answer was "+mTestQuestions.get(questionIndex)
                            .getmAnswer(0).getmAnswer(), Toast.LENGTH_LONG).show();
                }

                SingletonTestScore.get(getContext()).setmAnswered(SingletonTestScore.get(getContext()).getmAnswered()+1);
                Log.d("Frg Sub AnsCor: ", Integer.toString(SingletonTestScore.get(getContext()).getmAnsweredCorrectly()));
                Log.d("Frg Ans: ", Integer.toString(SingletonTestScore.get(getContext()).getmAnswered()));
                updateScore();

                disableRadioGroup();

            }
        });


        return v;
    }

    //Set the question and answers
    public void updateQuestion() {

        questionTitle.setText("Question "+Integer.toString(questionIndex+1)+": "+mTestQuestions.get(questionIndex).getmQuestion());

        testRadioButton1.setText(mTestQuestions.get(questionIndex).getmAnswers().get(displayAnswer(mTestQuestions.get(questionIndex))).getmAnswer());
        testRadioButton2.setText(mTestQuestions.get(questionIndex).getmAnswers().get(displayAnswer(mTestQuestions.get(questionIndex))).getmAnswer());
        testRadioButton3.setText(mTestQuestions.get(questionIndex).getmAnswers().get(displayAnswer(mTestQuestions.get(questionIndex))).getmAnswer());
        testRadioButton4.setText(mTestQuestions.get(questionIndex).getmAnswers().get(displayAnswer(mTestQuestions.get(questionIndex))).getmAnswer());
        testRadioButton5.setText(mTestQuestions.get(questionIndex).getmAnswers().get(displayAnswer(mTestQuestions.get(questionIndex))).getmAnswer());

        if(!mTestQuestions.get(questionIndex).getmAnswer(0).ismAlreadyDisplayed()) {
            setCorrectAnswer();
        }

        testRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                submitButton.setEnabled(true);

            }
        });
    }

    //Generate a random integer between min and max
    private int randInt(int min, int max) {
        Random rand=new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    //Used to place the correct answer randomly.
    public void setCorrectAnswer() {
        int randomInt=randInt(0,4);
        Log.d("Randomize answers", Integer.toString(randomInt));

        switch (randomInt) {
            case 0:
                testRadioButton1.setText(mTestQuestions.get(questionIndex).getmAnswer(0).getmAnswer());
                break;

            case 1:
                testRadioButton2.setText(mTestQuestions.get(questionIndex).getmAnswer(0).getmAnswer());
                break;

            case 2:
                testRadioButton3.setText(mTestQuestions.get(questionIndex).getmAnswer(0).getmAnswer());
                break;

            case 3:
                testRadioButton4.setText(mTestQuestions.get(questionIndex).getmAnswer(0).getmAnswer());
                break;

            case 4:
                testRadioButton5.setText(mTestQuestions.get(questionIndex).getmAnswer(0).getmAnswer());
                break;

            default:
                testRadioButton1.setText("setCorrectAnswer error");
                break;
        }
    }

    //Update the next button and submit button based on the question index
    public void updateButtons() {

        if(mTestQuestions.get(questionIndex).ismIsAnswered()) {
            if(questionIndex>=(MAX_QUESTIONS-1)) {
                nextButton.setText("TEST COMPLETE!");
            }
            nextButton.setEnabled(true);
            submitButton.setEnabled(false);
        } else {
            nextButton.setEnabled(false);
        }

        if(testRadioGroup.getCheckedRadioButtonId()==-1) {
            submitButton.setEnabled(false);
        }

    }

    public int displayAnswer(testQuestion testQuestion) {
        int randomNum;

        do {
            // nextInt is normally exclusive of the top value,
            // so add 1 to make it inclusive
            randomNum = randInt(0,8);
            Log.d("Randomize display ans", Integer.toString(randomNum));

            if(!testQuestion.getmAnswer(randomNum).ismAlreadyDisplayed()) {
                testQuestion.getmAnswer(randomNum).setmAlreadyDisplayed(true);
                return randomNum;
            }
        }while(testQuestion.getmAnswer(randomNum).ismAlreadyDisplayed());
        return 0;
    }

    //Check if the answer was answered correctly
    public boolean checkAnsweredCorrectly(int index, RadioButton selectedButton) {
        return (selectedButton.getText().equals(mTestQuestions.get(index).getmAnswer(0).getmAnswer()));
    }

    //disable the radio buttons after submitting the answer
    public void disableRadioGroup() {
        for (int i = 0; i < testRadioGroup.getChildCount(); i++) {
            testRadioGroup.getChildAt(i).setEnabled(false);
        }
    }

    //enable the radio buttons after clicking the next button
    public void enableRadioGroup() {
        for (int i = 0; i < testRadioGroup.getChildCount(); i++) {
            testRadioGroup.getChildAt(i).setEnabled(true);
        }
        testRadioGroup.clearCheck();
    }

    //Update the score at the top of the page
    public void updateScore() {
        //Object used to display decimal numbers with a specified format; # means optional if necessary while the 0 is a mandatory inclusion
        DecimalFormat df2 = new DecimalFormat("##0.##%");

        testScore.setText("Score: "+df2.format(SingletonTestScore.get(getContext()).getmScore()));

    }

}
