package com.example.android.rugbyscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declare score variables

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }

    /**
     * TRY:Adds five points to team A
     */
    public void addFiveTeamA(View v) {
        scoreTeamA = scoreTeamA + 5;
        displayTeamA(scoreTeamA);
    }

    /**
     * CONVERSION:Adds two points to team A
     */
    public void addTwoTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayTeamA(scoreTeamA);
    }

    /**
     * PENALTY KICK:Adds three points to team A
     */
    public void addThreeTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayTeamA(scoreTeamA);
    }

    /**
     * DROP GOAL:Adds three points to team A
     */
    public void plusThreeTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayTeamA(scoreTeamA);
    }

    /**
     * TRY:Adds five points to team B
     */
    public void addFiveTeamB(View v) {
        scoreTeamB = scoreTeamB + 5;
        displayTeamB(scoreTeamB);
    }

    /**
     * CONVERSION:Adds two points to team B
     */
    public void addTwoTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayTeamB(scoreTeamB);
    }

    /**
     * PENALTY KICK:Adds three points to team B
     */
    public void addThreeTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayTeamB(scoreTeamB);
    }

    /**
     * DROP GOAL:Adds three points to team B
     */
    public void plusThreeTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayTeamB(scoreTeamB);
    }

    /**
     * Displays the score for Team A
     */
    public void displayTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the score for Team B
     */
    public void displayTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * RESET: Resets the score to 0
     */
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }
}
