package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void plusThree(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void plusTwo(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void free(View view){
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

    public void freeB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View view) {
        scoreTeamA=scoreTeamB=0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
    /*
        Display score for team B
    * */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
