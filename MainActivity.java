package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


//Overwatch Quiz (QuizApp) by rinaDango @Udacity.
//***
//POTG - Play Of The Game.

public class MainActivity extends AppCompatActivity {
    private RadioGroup firstRadioGroup, secondRadioGroup, thirdRadioGroup, fourRadioGroup,
            fifthRadioGroup, seventhRadioGroup, eightRadioGroup;
            CheckBox six1A, six1B, six1C, six1D, six1E, six1F;

    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstRadioGroup = (RadioGroup) findViewById(R.id.q1);
        secondRadioGroup = (RadioGroup) findViewById(R.id.q2);
        thirdRadioGroup = (RadioGroup) findViewById(R.id.q3);
        fourRadioGroup = (RadioGroup) findViewById(R.id.q4);
        fifthRadioGroup = (RadioGroup) findViewById(R.id.q5);
        seventhRadioGroup = (RadioGroup) findViewById(R.id.q7);
        eightRadioGroup = (RadioGroup) findViewById(R.id.q8);
        six1A = (CheckBox) findViewById(R.id.q6A);
        six1B = (CheckBox) findViewById(R.id.q6B);
        six1C = (CheckBox) findViewById(R.id.q6C);
        six1D = (CheckBox) findViewById(R.id.q6D);
        six1E = (CheckBox) findViewById(R.id.q6E);
        six1F = (CheckBox) findViewById(R.id.q6F);


    }


    public void pOTG(View view) {

        //Radio button is checked for q1
        RadioButton questionOneA = (RadioButton) findViewById(R.id.q1A);
        boolean q1A = questionOneA.isChecked();
        RadioButton questionOneB = (RadioButton) findViewById(R.id.q1B);
        boolean q1B = questionOneB.isChecked();
        RadioButton questionOneC = (RadioButton) findViewById(R.id.q1C);
        boolean q1C = questionOneC.isChecked();

        //Radio button is checked for q2
        RadioButton questionTwoA = (RadioButton) findViewById(R.id.q2A);
        boolean q2A = questionTwoA.isChecked();
        RadioButton questionTwoB = (RadioButton) findViewById(R.id.q2B);
        boolean q2B = questionTwoB.isChecked();
        RadioButton questionTwoC = (RadioButton) findViewById(R.id.q2C);
        boolean q2C = questionTwoC.isChecked();

        //Radio button is checked for q3
        RadioButton questionThreeA = (RadioButton) findViewById(R.id.q3A);
        boolean q3A = questionThreeA.isChecked();
        RadioButton questionThreeB = (RadioButton) findViewById(R.id.q3B);
        boolean q3B = questionThreeB.isChecked();
        RadioButton questionThreeC = (RadioButton) findViewById(R.id.q3C);
        boolean q3C = questionThreeC.isChecked();

        //Radio button is checked for q4
        RadioButton questionFourA = (RadioButton) findViewById(R.id.q4A);
        boolean q4A = questionFourA.isChecked();
        RadioButton questionFourB = (RadioButton) findViewById(R.id.q4B);
        boolean q4B = questionFourB.isChecked();
        RadioButton questionFourC = (RadioButton) findViewById(R.id.q4C);
        boolean q4C = questionFourC.isChecked();

        //Radio button is checked for q5
        RadioButton questionFiveA = (RadioButton) findViewById(R.id.q5A);
        boolean q5A = questionFiveA.isChecked();
        RadioButton questionFiveB = (RadioButton) findViewById(R.id.q5B);
        boolean q5B = questionFiveB.isChecked();
        RadioButton questionFiveC = (RadioButton) findViewById(R.id.q5C);
        boolean q5C = questionFiveC.isChecked();

        //Check box is checked for q6
        CheckBox questionSixA = (CheckBox) findViewById(R.id.q6A);
        boolean q6A = questionSixA.isChecked();
        CheckBox questionSixB = (CheckBox) findViewById(R.id.q6B);
        boolean q6B = questionSixB.isChecked();
        CheckBox questionSixC = (CheckBox) findViewById(R.id.q6C);
        boolean q6C = questionSixC.isChecked();
        CheckBox questionSixD = (CheckBox) findViewById(R.id.q6D);
        boolean q6D = questionSixD.isChecked();
        CheckBox questionSixE = (CheckBox) findViewById(R.id.q6E);
        boolean q6E = questionSixE.isChecked();
        CheckBox questionSixF = (CheckBox) findViewById(R.id.q6F);
        boolean q6F = questionSixF.isChecked();

        //Radio button is checked for q7
        RadioButton questionSevenA = (RadioButton) findViewById(R.id.q7A);
        boolean q7A = questionSevenA.isChecked();
        RadioButton questionSevenB = (RadioButton) findViewById(R.id.q7B);
        boolean q7B = questionSevenB.isChecked();
        RadioButton questionSevenC = (RadioButton) findViewById(R.id.q7C);
        boolean q7C = questionSevenC.isChecked();

        //Radio button is checked for q8
        RadioButton questionEightA = (RadioButton) findViewById(R.id.q8A);
        boolean q8A = questionEightA.isChecked();
        RadioButton questionEightB = (RadioButton) findViewById(R.id.q8B);
        boolean q8B = questionEightB.isChecked();
        RadioButton questionEightC = (RadioButton) findViewById(R.id.q8C);
        boolean q8C = questionEightC.isChecked();

        //Uses calculatePOTG method to calculate score
        int potgFinal = calculatePOTG(q1A, q1B, q1C, q2A, q2B, q2C, q3A, q3B, q3C, q4A, q4B, q4C, q5A, q5B, q5C, q6A, q6B, q6C, q6D, q6E, q6F, q7A, q7B, q7C, q8A, q8B, q8C);


        //Shows the final score of the quiz
        String theMessage = "The final score is " + potgFinal + " out of 8 !";
        displayScoreMessage(theMessage);

        //Gives a toast message if the 1 q is not answered
        if (firstRadioGroup.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "Question 1 is not answered", Toast.LENGTH_SHORT).show();
        }

        //Gives a toast message if the 2 q is not answered
        if (secondRadioGroup.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "Question 2 is not answered", Toast.LENGTH_SHORT).show();
        }

        //Gives a toast message if the 3 q is not answered
        if (thirdRadioGroup.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "Question 3 is not answered", Toast.LENGTH_SHORT).show();
        }

        //Gives a toast message if the 4 q is not answered
        if (fourRadioGroup.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "Question 4 is not answered", Toast.LENGTH_SHORT).show();
        }

        //Gives a toast message if the 5 q is not answered
        if (fifthRadioGroup.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "Question 5 is not answered", Toast.LENGTH_SHORT).show();
        }

        //Gives a toast message if the 6 q is not answered
        if (!(q6A||q6B||q6C||q6D||q6E||q6F)) {
            Toast.makeText(this, "Question 6 is not answered", Toast.LENGTH_SHORT).show();
        }

        //Gives a toast message if the 7 q is not answered
        if (seventhRadioGroup.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "Question 7 is not answered", Toast.LENGTH_SHORT).show();
        }

        //Gives a toast message if the 8 q is not answered
        if (eightRadioGroup.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "Question 8 is not answered", Toast.LENGTH_SHORT).show();
        }

    }

    //Method to calculate the final score of the Quiz
    public int calculatePOTG (boolean ans1A, boolean ans1B, boolean ans1C,boolean ans2A, boolean ans2B,
                               boolean ans2C, boolean ans3A, boolean ans3B, boolean ans3C, boolean ans4A,
                               boolean ans4B, boolean ans4C, boolean ans5A, boolean ans5B, boolean ans5C,
                               boolean ans6A, boolean ans6B, boolean ans6C, boolean ans6D, boolean ans6E,
                               boolean ans6F, boolean ans7A, boolean ans7B, boolean ans7C, boolean ans8A,
                               boolean ans8B, boolean ans8C) {

        //Is the question 1 answered correctly or not (radiobutton)
        //The right answer is ans1A
        if (ans1A){
            score = score + 1;
        }
        else if (ans1B) {
            score = score + 0;
        }
        else if (ans1C){
            score = score + 0;
        }

        //Is the question 2 answered correctly or not (radiobutton)
        //The right answer is ans2B
        if (ans2A){
            score = score + 0;
        }
        else if (ans2B){
            score = score + 1;
        }
        else if (ans2C){
            score = score + 0;
        }

        //Is the question 3 answered correctly or not (radiobutton)
        //The right answer is ans3C
        if (ans3A) {
            score = score + 0;
        }
        else if (ans3B) {
            score = score + 0;
        }
        else if (ans3C) {
            score = score + 1;
        }

        //Is the question 4 answered correctly or not (radiobutton)
        //The right answer is ans4C
        if (ans4A){
            score = score + 0;
        }
        else if (ans4B){
            score = score + 0;
        }
        else if (ans4C){
            score = score + 1;
        }

        //Is the question 5 answered correctly or not (radiobutton)
        //The right answer is ans5B
        if (ans5A){
            score = score + 0;
        }
        else if (ans5B){
            score = score + 1;
        }
        else if (ans5C){
            score = score + 0;
        }

        //Is the question 6 answered correctly or not (checkbox)
        //The right answers are ans6A, ans6B, ans6E, ans6F
        //Its a multiple answer question, so if checked correctly 1 point is added
        if (ans6A && ans6B && ans6E && ans6F){
            score = score + 1;
        }
        if (ans6C && ans6D){
            score = score + 0;
        }


        //Is the question 7 answered correctly or not (radiobutton)
        //The right answer is ans7A
        if (ans7A){
            score = score + 1;
        }
        else if (ans7B){
            score = score + 0;
        }
        else if (ans7C){
            score = score + 0;
        }

        //Is the question 8 answered correctly or not (radiobutton)
        //The right answer is ans8C
        if (ans8A){
            score = score + 0;
        }
        else if (ans8B){
            score = score + 0;
        }
        else if (ans8C){
            score = score + 1;
        }

        //Return the final score
        return score;

    }

    //Resets the score to 0 and unchecks all the radiobuttons and checkboxes, when the Reset button is pressed
    public void resetButton (View v){

        //Resets score
        score = 0;
        String resetScoreMessage = "  ";
        displayScoreMessage(resetScoreMessage);

        //Unchecks RadioButtons
        firstRadioGroup.clearCheck();
        secondRadioGroup.clearCheck();
        thirdRadioGroup.clearCheck();
        fourRadioGroup.clearCheck();
        fifthRadioGroup.clearCheck();
        seventhRadioGroup.clearCheck();
        eightRadioGroup.clearCheck();

        //Unchecks CheckBoxes
        six1A.setChecked(false);
        six1B.setChecked(false);
        six1C.setChecked(false);
        six1D.setChecked(false);
        six1E.setChecked(false);
        six1F.setChecked(false);
    }




    /**
     * This method displays the given text on the screen.
     */
    private void displayScoreMessage(String message) {
        TextView messageOfTheScore = (TextView) findViewById(R.id.score_answer);
        messageOfTheScore.setText(message);
    }



}









