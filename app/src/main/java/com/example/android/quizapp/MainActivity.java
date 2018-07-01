package com.example.android.quizapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.unstoppable.submitbuttonview.SubmitButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *  this method is called when the buttons on question one are clicked.
     */


    public void onClick_question1_1(View view) {
        Toast.makeText(this, R.string.correct_answer, Toast.LENGTH_SHORT).show();

    }

    public void onClick_question1_2(View view) {
        Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
    }

    public void onClick_question1_3(View view) {
        Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
    }

    public void onClick_question1_4(View view) {
        Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when options on question 4 is clicked
     *
     */

    public void onClick_question2_1(View view) {
        Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
    }

    public void onClick_question2_2(View view) {
        Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
    }

    public void onClick_question2_3(View view) {
        Toast.makeText(this, R.string.correct_answer, Toast.LENGTH_SHORT).show();
    }

    public void onClick_question2_4(View view) {
        Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
    }

    public void onClick_question3_1(View view) {
        Toast.makeText(this, R.string.correct_answer, Toast.LENGTH_SHORT).show();
    }

    public void onClick_question3_2(View view) {
        Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
    }

    public void onClick_question3_3(View view) {
        Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
    }

    public void onClick_question3_4(View view) {
        Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
    }


    public void onClick_question4_1(View view) {
        Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
    }

    public void onClick_question4_2(View view) {
        Toast.makeText(this, R.string.correct_answer, Toast.LENGTH_SHORT).show();
    }

    public void onClick_question4_3(View view) {
        Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
    }

    public void onClick_question4_4(View view) {
        Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
    }

    public void onClick_question5_1(View view) {
        Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
    }

    public void onClick_question5_2(View view) {
        Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
    }

    public void onClick_question5_3(View view) {
        Toast.makeText(this, R.string.correct_answer, Toast.LENGTH_SHORT).show();
    }

    public void onClick_question5_4(View view) {
        Toast.makeText(this, R.string.wrong_answer, Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.Radio_button1:
                if (checked)
                    // Correct answer
                    break;
            case R.id.Radio_button2:
                if (checked)
                    // wrong answer
                    break;
            case R.id.Radio_button3:
                if (checked)
                    break;
                //Correct answer
        }
    }


}
