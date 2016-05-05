package edu.missouriwestern.fforestier.morpions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ChosenameActivity extends AppCompatActivity {

    public final static String PL1_NAME = "Player1 name";
    public final static String PL2_NAME = "Player2 name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosename);
    }

    public void launchGame(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        EditText player1 = (EditText) findViewById(R.id.player1_input);
        EditText player2 = (EditText) findViewById(R.id.player2_input);
        String pl1name = player1.getText().toString();
        String pl2name = player2.getText().toString();
        intent.putExtra(PL1_NAME, pl1name);
        intent.putExtra(PL2_NAME, pl2name);
        startActivity(intent);
    }
}
