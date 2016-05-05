package edu.missouriwestern.fforestier.morpions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void choseName(View view) {
        Intent intent = new Intent(this, ChosenameActivity.class);
        startActivity(intent);
    }

    public void displayScores(View view) {
        Intent intent = new Intent(this, ScoresActivity.class);
        startActivity(intent);
    }
}
