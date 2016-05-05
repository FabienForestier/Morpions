package edu.missouriwestern.fforestier.morpions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class ScoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);

        Intent intent = getIntent();

        DatabaseHandler db = new DatabaseHandler(this);

        List<Score> scores = db.getAllScores();
        TextView t = (TextView) findViewById(R.id.scores);
        for (Score cn : scores) {
            String log = cn.get_player1()+ "    " + cn.get_score_player1() + "-" + cn.get_score_player2()
                    + "    " + cn.get_player2()+"\n";
            t.append(log);
        }
    }
}
