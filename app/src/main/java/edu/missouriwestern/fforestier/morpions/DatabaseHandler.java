package edu.missouriwestern.fforestier.morpions;

/**
 * Created by Fabien on 04/05/2016.
 */
import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "morpions";

    // Contacts table name
    private static final String TABLE_SCORE = "scores";

    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_PLAYER1  = "player1";
    private static final String KEY_PLAYER2 = "player2";
    private static final String KEY_SCORE_PLAYER1 = "score_player1";
    private static final String KEY_SCORE_PLAYER2 = "score_player2";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_SCORE_TABLE = "CREATE TABLE " + TABLE_SCORE + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_PLAYER1 + " TEXT,"
                + KEY_PLAYER2 + " TEXT,"+ KEY_SCORE_PLAYER1 + " TEXT"+ KEY_SCORE_PLAYER2 + " TEXT"
                + ")";
        db.execSQL(CREATE_SCORE_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SCORE);

        // Create tables again
        onCreate(db);
    }

    /**
     * All CRUD(Create, Read, Update, Delete) Operations
     */


    void addScore(Score score) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_PLAYER1, score.get_player1());
        values.put(KEY_PLAYER2, score.get_player2());
        values.put(KEY_SCORE_PLAYER1, score.get_score_player1()); // Contact Name
        values.put(KEY_SCORE_PLAYER2, score.get_score_player2());

        // Inserting Row
        db.insert(TABLE_SCORE, null, values);
        db.close(); // Closing database connection
    }

    Score getScore(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_SCORE, new String[] { KEY_ID,
                        KEY_PLAYER1,KEY_PLAYER2,KEY_SCORE_PLAYER1,KEY_SCORE_PLAYER2 }, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Score score = new Score(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
        return score;
    }

    public List<Score> getAllScores() {
        List<Score> scoreList = new ArrayList<Score>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_SCORE;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Score score = new Score();
                score.set_id(Integer.parseInt(cursor.getString(0)));
                score.set_player1(cursor.getString(1));
                score.set_player2(cursor.getString(2));
                score.set_score_player1(cursor.getString(3));
                score.set_score_player2(cursor.getString(4));

                scoreList.add(score);
            } while (cursor.moveToNext());
        }

        // return contact list
        return scoreList;
    }

    // Updating single contact
    public int updateScore(Score score) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_PLAYER1, score.get_player1());
        values.put(KEY_PLAYER2, score.get_player2());
        values.put(KEY_SCORE_PLAYER1, score.get_score_player1());
        values.put(KEY_SCORE_PLAYER2, score.get_score_player2());

        // updating row
        return db.update(TABLE_SCORE, values, KEY_ID + " = ?",
                new String[] { String.valueOf(score.get_id())});
    }


    public void deleteScore(Score score) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_SCORE, KEY_ID + " = ?",
                new String[] { String.valueOf(score.get_id())});
        db.close();
    }



    public int getScoresCount() {
        String countQuery = "SELECT  * FROM " + TABLE_SCORE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }

}
