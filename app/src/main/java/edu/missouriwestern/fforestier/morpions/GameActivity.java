package edu.missouriwestern.fforestier.morpions;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;
import android.view.Menu;

import java.util.List;

public class GameActivity extends AppCompatActivity {

    Button b11,b12,b13,b21,b22,b23,b31,b32,b33;
    String image ="o";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent intent = getIntent();
        String player1_name = intent.getStringExtra(ChosenameActivity.PL1_NAME);
        String player2_name = intent.getStringExtra(ChosenameActivity.PL2_NAME);

        TextView pl1 = (TextView) findViewById(R.id.Player1_name);
        pl1.setText(player1_name);
        TextView pl2 = (TextView) findViewById(R.id.Player2_name);
        pl2.setText(player2_name);

        b11 = (Button) findViewById(R.id.btn11);
        b12 = (Button) findViewById(R.id.btn12);
        b13 = (Button) findViewById(R.id.btn13);
        b21 = (Button) findViewById(R.id.btn21);
        b22 = (Button) findViewById(R.id.btn22);
        b23 = (Button) findViewById(R.id.btn23);
        b31 = (Button) findViewById(R.id.btn31);
        b32 = (Button) findViewById(R.id.btn32);
        b33 = (Button) findViewById(R.id.btn33);

        findViewById(R.id.Player1_name).setBackgroundColor(Color.GREEN);

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((String)findViewById(R.id.btn11).getContentDescription()== null) {
                    if (image == "o") {
                        b11.setBackgroundResource(R.drawable.o);
                        b11.setContentDescription(getString(R.string.o));
                        image = "x";
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    } else {
                        b11.setBackgroundResource(R.drawable.x);
                        b11.setContentDescription(getString(R.string.x));
                        image = "o";
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    }
                }
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((String)findViewById(R.id.btn12).getContentDescription()== null) {
                    if (image == "o") {
                        b12.setBackgroundResource(R.drawable.o);
                        b12.setContentDescription(getString(R.string.o));
                        image = "x";
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    } else {
                        b12.setBackgroundResource(R.drawable.x);
                        b12.setContentDescription(getString(R.string.x));
                        image = "o";
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    }
                }
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((String)findViewById(R.id.btn13).getContentDescription()== null) {
                    if (image == "o") {
                        b13.setBackgroundResource(R.drawable.o);
                        b13.setContentDescription(getString(R.string.o));
                        image = "x";
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    } else {
                        b13.setBackgroundResource(R.drawable.x);
                        b13.setContentDescription(getString(R.string.x));
                        image = "o";
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    }
                }
            }
        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((String)findViewById(R.id.btn21).getContentDescription()== null) {
                    if (image == "o") {
                        b21.setBackgroundResource(R.drawable.o);
                        b21.setContentDescription(getString(R.string.o));
                        image = "x";
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    } else {
                        b21.setBackgroundResource(R.drawable.x);
                        b21.setContentDescription(getString(R.string.x));
                        image = "o";
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    }
                }
            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((String)findViewById(R.id.btn22).getContentDescription()== null) {
                    if (image == "o") {
                        b22.setBackgroundResource(R.drawable.o);
                        b22.setContentDescription(getString(R.string.o));
                        image = "x";
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    } else {
                        b22.setBackgroundResource(R.drawable.x);
                        b22.setContentDescription(getString(R.string.x));
                        image = "o";
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    }
                }
            }
        });

        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((String)findViewById(R.id.btn23).getContentDescription()== null) {
                    if (image == "o") {
                        b23.setBackgroundResource(R.drawable.o);
                        b23.setContentDescription(getString(R.string.o));
                        image = "x";
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    } else {
                        b23.setBackgroundResource(R.drawable.x);
                        b23.setContentDescription(getString(R.string.x));
                        image = "o";
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    }
                }
            }
        });

        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((String)findViewById(R.id.btn31).getContentDescription()== null) {
                    if (image == "o") {
                        b31.setBackgroundResource(R.drawable.o);
                        b31.setContentDescription(getString(R.string.o));
                        image = "x";
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    } else {
                        b31.setBackgroundResource(R.drawable.x);
                        b31.setContentDescription(getString(R.string.x));
                        image = "o";
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    }
                }
            }
        });

        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((String)findViewById(R.id.btn32).getContentDescription()== null) {
                    if (image == "o") {
                        b32.setBackgroundResource(R.drawable.o);
                        b32.setContentDescription(getString(R.string.o));
                        image = "x";
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    } else {
                        b32.setBackgroundResource(R.drawable.x);
                        b32.setContentDescription(getString(R.string.x));
                        image = "o";
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    }
                }
            }
        });

        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((String)findViewById(R.id.btn33).getContentDescription()== null) {
                    if (image == "o") {
                        b33.setBackgroundResource(R.drawable.o);
                        b33.setContentDescription(getString(R.string.o));
                        image = "x";
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    } else {
                        b33.setBackgroundResource(R.drawable.x);
                        b33.setContentDescription(getString(R.string.x));
                        image = "o";
                        findViewById(R.id.Player1_name).setBackgroundColor(Color.GREEN);
                        findViewById(R.id.Player2_name).setBackgroundColor(Color.WHITE);
                        checkStatus();
                    }
                }
            }
        });
    }

    private void checkStatus(){
        String[][] b =new String[3][3];
        Boolean finished = false;
        String winner ="";
        if((String)findViewById(R.id.btn11).getContentDescription()!= null)
        {
            b[0][0] = (String)findViewById(R.id.btn11).getContentDescription();
        }else {
            b[0][0] = "";
        }
        if((String)findViewById(R.id.btn12).getContentDescription()!= null) {
            b[0][1] = (String) findViewById(R.id.btn12).getContentDescription();
        }else {
            b[0][1] = "";
        }
        if((String)findViewById(R.id.btn13).getContentDescription()!= null) {
            b[0][2] = (String) findViewById(R.id.btn13).getContentDescription();
        }else {
            b[0][2] = "";
        }
        if((String)findViewById(R.id.btn21).getContentDescription()!= null) {
            b[1][0] = (String) findViewById(R.id.btn21).getContentDescription();
        }else {
            b[1][0] = "";
        }
        if((String)findViewById(R.id.btn22).getContentDescription()!= null) {
            b[1][1] = (String) findViewById(R.id.btn22).getContentDescription();
        }else {
            b[1][1] = "";
        }
        if((String)findViewById(R.id.btn23).getContentDescription()!= null) {
            b[1][2] = (String) findViewById(R.id.btn23).getContentDescription();
        }else {
            b[1][2] = "";
        }
        if((String)findViewById(R.id.btn31).getContentDescription()!= null) {
            b[2][0] = (String) findViewById(R.id.btn31).getContentDescription();
        }else {
            b[2][0] = "";
        }
        if((String)findViewById(R.id.btn32).getContentDescription()!= null) {
            b[2][1] = (String) findViewById(R.id.btn32).getContentDescription();
        }else {
            b[2][1] = "";
        }
        if((String)findViewById(R.id.btn33).getContentDescription()!= null) {
            b[2][2] = (String) findViewById(R.id.btn33).getContentDescription();
        }else {
            b[2][2] = "";
        }

        if(((b[0][0]).equals(b[0][1])) && ((b[0][0]).equals(b[0][2])) && !(b[0][0]).equals(""))
        {
            finished = true;
            winner= b[0][0];
        }
        if(b[1][0].equals(b[1][1]) && b[1][0].equals(b[1][2]) && !(b[1][0]).equals(""))
        {
            finished = true;
            winner= b[1][0];
        }
        if(b[2][0].equals(b[2][1]) && b[2][0].equals(b[2][2]) && !(b[2][0]).equals(""))
        {
            finished = true;
            winner= b[2][0];
        }
        if(b[0][0].equals(b[1][0]) && b[0][0].equals(b[2][0]) && !(b[0][0]).equals(""))
        {
            finished = true;
            winner= b[0][0];
        }
        if(b[0][1].equals(b[1][1]) && b[0][1].equals(b[2][1]) && !(b[0][1]).equals(""))
        {
            finished = true;
            winner= b[0][1];
        }
        if(b[0][2].equals(b[1][2]) && b[0][2].equals(b[2][2]) && !(b[0][2]).equals(""))
        {
            finished = true;
            winner= b[0][2];
        }
        if(b[0][0].equals(b[1][1]) && b[0][0].equals(b[2][2]) && !(b[0][0]).equals(""))
        {
            finished = true;
            winner= b[0][0];
        }
        if(b[0][2].equals(b[1][1]) && b[0][2].equals(b[2][0]) && !(b[0][2]).equals(""))
        {
            finished = true;
            winner= b[0][2];
        }
        int i =0;
        int j = 0;
        Boolean triggerout = false;
        while(i<3 && triggerout==false)
        {
            while(j<3 && triggerout==false)
            {
                if((b[i][j]).equals(""))
                {
                    triggerout = true;
                }
                j++;
            }
            j=0;
            i++;
        }
        if(!triggerout)
        {
            finished = true;
        }


        if(finished)
        {
            open(null,winner);
        }

    }

    public void open(View view,String winner) {
        final DatabaseHandler db = new DatabaseHandler(this);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        String sentence="";
        if(winner.equals("o"))
        {
            TextView p = (TextView)findViewById(R.id.Player1_name);
            sentence = p.getText()+" won!! Do you want to play again?";
            TextView score = (TextView) findViewById(R.id.scorepl1);
            int s = Integer.parseInt(score.getText().toString());
            s++;
            score.setText(String.valueOf(s));
        }else
        {
            if(winner.equals("x"))
            {
                TextView p = (TextView)findViewById(R.id.Player2_name);
                sentence = p.getText()+" won!! Do you want to play again?";
                TextView score = (TextView) findViewById(R.id.scorepl2);
                int s = Integer.parseInt(score.getText().toString());
                s++;
                score.setText(String.valueOf(s));
            }else
            {
                sentence = "Do you want to play again?";
            }
        }

        alertDialogBuilder.setMessage(sentence);

        alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                clearBoard();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                TextView p1 = (TextView)findViewById(R.id.Player1_name);
                TextView s1 = (TextView)findViewById(R.id.scorepl1);
                TextView p2 = (TextView)findViewById(R.id.Player2_name);
                TextView s2 = (TextView)findViewById(R.id.scorepl2);
                db.addScore(new Score(p1.getText().toString(),p2.getText().toString(),s1.getText().toString(),s2.getText().toString()));
                List<Score> contacts = db.getAllScores();

                for (Score cn : contacts) {
                    String log = "Id: " + cn.get_id() + " ,Player1: " + cn.get_player1()
                            + " ,Score: " + cn.get_score_player1() + " ,Player2: " + cn.get_player2()
                            + " ,Score: " + cn.get_score_player2();
                    // Writing Contacts to log
                    Log.d("Name: ", log);
                }
                finish();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void clearBoard()
    {
        b11.setBackground(null);
        b12.setBackground(null);
        b13.setBackground(null);
        b21.setBackground(null);
        b22.setBackground(null);
        b23.setBackground(null);
        b31.setBackground(null);
        b32.setBackground(null);
        b33.setBackground(null);

        b11.setContentDescription(null);
        b12.setContentDescription(null);
        b13.setContentDescription(null);
        b21.setContentDescription(null);
        b22.setContentDescription(null);
        b23.setContentDescription(null);
        b31.setContentDescription(null);
        b32.setContentDescription(null);
        b33.setContentDescription(null);

        b11.setBackgroundColor(getResources().getColor(R.color.launch));
        b12.setBackgroundColor(getResources().getColor(R.color.launch));
        b13.setBackgroundColor(getResources().getColor(R.color.launch));
        b21.setBackgroundColor(getResources().getColor(R.color.launch));
        b22.setBackgroundColor(getResources().getColor(R.color.launch));
        b23.setBackgroundColor(getResources().getColor(R.color.launch));
        b31.setBackgroundColor(getResources().getColor(R.color.launch));
        b32.setBackgroundColor(getResources().getColor(R.color.launch));
        b33.setBackgroundColor(getResources().getColor(R.color.launch));


    }
}
