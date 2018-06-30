package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int TeamA_score = 0;
    int TeamB_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Free throw method for team A
    public void AddOneTeamA (View view){
        TeamA_score = TeamA_score + 1;
        displayScoreTeamA(TeamA_score);
    }

    // 2 points method for team A
    public void AddTwoTeamA (View view){
        TeamA_score = TeamA_score + 2;
        displayScoreTeamA(TeamA_score);
    }

    // 3 points method for team A
    public void AddThreeTeamA (View view){
        TeamA_score = TeamA_score + 3;
        displayScoreTeamA(TeamA_score);
    }

    // Free throw method for Team B
    public void AddOneTeamB (View view){
        TeamB_score = TeamB_score + 1;
        displayScoreTeamB(TeamB_score);
    }

    // 2 points method for Team B
    public void AddTwoTeamB (View view) {
        TeamB_score = TeamB_score + 2;
        displayScoreTeamB(TeamB_score);
    }

    // 2 points method for Team B
    public void AddThreeTeamB (View view) {
        TeamB_score = TeamB_score + 3;
        displayScoreTeamB(TeamB_score);
    }

    // Reset button
    public void Reset (View view) {
        TeamA_score = 0;
        TeamB_score = 0;
        displayScoreTeamA(TeamA_score);
        displayScoreTeamB(TeamB_score);
        displayFinalScoreA(TeamA_score);
        displayFinalScoreB(TeamB_score);
    }

    private void displayScoreTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.TeamBScore);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    private void displayScoreTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.TeamAScore);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    // End game button method
    public void endGame (View view){
        displayFinalScoreA(TeamA_score);
        displayFinalScoreB(TeamB_score);
    }

    // Displays the final score for Team A on the screen
    private void displayFinalScoreA(int scoreTeamA) {
        TextView FinalScore = (TextView) findViewById(R.id.displayScoreA);
        FinalScore.setText(String.valueOf(scoreTeamA));
    }

    // Displays the final score for Team B on the screen
    private void displayFinalScoreB(int scoreTeamB) {
        TextView FinalScore = (TextView) findViewById(R.id.displayScoreB);
        FinalScore.setText(String.valueOf(scoreTeamB));
    }

}