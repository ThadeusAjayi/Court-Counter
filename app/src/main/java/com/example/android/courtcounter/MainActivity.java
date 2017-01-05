package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int scoreTeamA = 0;
    public int scoreTeamB = 0;

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusThree(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void plusTwo(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrow(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void plusThreeB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void plusTwoB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view){
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
