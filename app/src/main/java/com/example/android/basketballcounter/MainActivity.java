package com.example.android.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTeam1;
    int scoreTeam2;
    int foulTeam1;
    int foulTeam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showFoulsForTeam1(0);
        showFoulsForTeam2(0);
        showScoreForTeam1(0);
        showScoreForTeam2(0);
    }

    /*
    * increase team 1 score by 3 points
    */

    public void addThreePointsForTeam1(View view) {

        scoreTeam1 += 3;
        showScoreForTeam1(scoreTeam1);
    }

    /*
    * increase team 1 score by 3 points
    */

    public void addTwoPointsForTeam1(View view) {

        scoreTeam1 += 2;
        showScoreForTeam1(scoreTeam1);
    }

    /*
    * increase team 1 score by 3 points
    */

    public void addOnePointForTeam1(View view) {

        scoreTeam1 += 1;
        showScoreForTeam1(scoreTeam1);

    }

    /*
    * increase team 2 score by 3 points
    */

    public void addThreePointsForTeam2(View view) {

        scoreTeam2 += 3;
        showScoreForTeam2(scoreTeam2);

    }

    /*
    * increase team 2 score by 2 points
    */

    public void addTwoPointsForTeam2(View view) {

        scoreTeam2 += 2;
        showScoreForTeam2(scoreTeam2);
    }

    /*
    * increase team 2 score by 1 point
    */

    public void addOnePointForTeam2(View view) {

        scoreTeam2 += 1;
        showScoreForTeam2(scoreTeam2);

    }

    /*
    * declares fouls for team 1
    */

    public void increaseFoulForTeam1(View view) {

        foulTeam1 += 1;
        showFoulsForTeam1(foulTeam1);
        if (foulTeam1 == 6) {

            Toast.makeText(this, "Team 1 Got Bonus!", Toast.LENGTH_SHORT).show();
            addBonusForTeam1("Bonus");
            return;
        }
    }

    /*
    * declares fouls for team 1
    */

    public void increaseFoulForTeam2(View view) {

        foulTeam2 += 1;
        showFoulsForTeam2(foulTeam2);
        if (foulTeam2 == 6) {

            Toast.makeText(this, "Team 2 Got Bonus!", Toast.LENGTH_SHORT).show();
            addBonusForTeam2("Bonus");
            return;
        }
    }

    /**
     * displays score for team 1
     */

    private void showScoreForTeam1(int score) {

        TextView scoreTeam1 = (TextView) findViewById(R.id.team_1_score);
        scoreTeam1.setText(String.valueOf(score));
    }

    /**
     * displays score for team 2
     */

    private void showScoreForTeam2(int score) {

        TextView scoreTeam2 = (TextView) findViewById(R.id.team_2_score);
        scoreTeam2.setText(String.valueOf(score));
    }

    /**
     * shows fouls for team 1
     */

    private void showFoulsForTeam1(int foul) {

        TextView foulTeam1 = (TextView) findViewById(R.id.team_1_fouls);
        foulTeam1.setText(String.valueOf(foul));
    }

    /**
     * shows fouls for team 2
     */

    private void showFoulsForTeam2(int foul) {

        TextView foulTeam2 = (TextView) findViewById(R.id.team_2_fouls);
        foulTeam2.setText(String.valueOf(foul));
    }

    /*
    * add foul bonus for team 1
    */

    private void addBonusForTeam1(String bonus) {

        TextView bonus1 = (TextView) findViewById(R.id.bonus_team1);
        bonus1.setText(bonus);

    }

    /*
     * add foul bonus for team 2
     */

    private void addBonusForTeam2(String bonus) {

        TextView bonus2 = (TextView) findViewById(R.id.bonus_team2);
        bonus2.setText(bonus);

    }

    /*
    * resets the scores and fouls for both teams
    */

    public void reset(View view) {
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        foulTeam1 = 0;
        foulTeam2 = 0;
        showScoreForTeam1(scoreTeam1);
        showScoreForTeam2(scoreTeam2);
        showFoulsForTeam1(foulTeam1);
        showFoulsForTeam2(foulTeam2);
        addBonusForTeam1(" ");
        addBonusForTeam2(" ");
    }

}
