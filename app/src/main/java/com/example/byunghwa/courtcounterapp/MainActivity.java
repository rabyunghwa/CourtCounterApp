package com.example.byunghwa.courtcounterapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvScoreFirstGroup, tvScoreSecondGroup;
    int scoreFirstGroup, scoreSecondGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey("scoreFirstGroup")) {
                scoreFirstGroup = savedInstanceState.getInt("scoreFirstGroup");
            }
            if (savedInstanceState.containsKey("scoreSecondGroup")) {
                scoreSecondGroup = savedInstanceState.getInt("scoreSecondGroup");
            }
        }

        tvScoreFirstGroup = (TextView) findViewById(R.id.tvScoreFirstGroup);
        tvScoreSecondGroup = (TextView) findViewById(R.id.tvScoreSecondGroup);

        tvScoreFirstGroup.setText(String.valueOf(scoreFirstGroup));
        tvScoreSecondGroup.setText(String.valueOf(scoreSecondGroup));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreFirstGroup", scoreFirstGroup);
        outState.putInt("scoreSecondGroup", scoreSecondGroup);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void resetScores(MenuItem item) {
        scoreFirstGroup = 0;
        scoreSecondGroup = 0;
        updateScoreFirstGroup();
        updateScoreSecondGroup();
    }

    public void minusOneFirstGroup(View view) {
        scoreFirstGroup -= 1;
        updateScoreFirstGroup();
    }

    public void plusTwoFirstGroup(View view) {
        scoreFirstGroup += 2;
        updateScoreFirstGroup();
    }

    public void plusThreeFirstGroup(View view) {
        scoreFirstGroup += 3;
        updateScoreFirstGroup();
    }

    public void minusOneSecondGroup(View view) {
        scoreSecondGroup -= 1;
        updateScoreSecondGroup();
    }

    public void plusTwoSecondGroup(View view) {
        scoreSecondGroup += 2;
        updateScoreSecondGroup();
    }

    public void plusThreeSecondGroup(View view) {
        scoreSecondGroup += 3;
        updateScoreSecondGroup();
    }

    public void updateScoreFirstGroup() {
        tvScoreFirstGroup.setText(String.valueOf(scoreFirstGroup));
    }

    public void updateScoreSecondGroup() {
        tvScoreSecondGroup.setText(String.valueOf(scoreSecondGroup));
    }
}
