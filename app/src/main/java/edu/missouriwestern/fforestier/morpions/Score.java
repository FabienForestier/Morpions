package edu.missouriwestern.fforestier.morpions;

/**
 * Created by Fabien on 04/05/2016.
 */
public class Score {
    int _id;
    String _player1;
    String _player2;
    String _score_player1;
    String _score_player2;

    public Score(){

    }

    public Score(int _id, String _player1, String _player2, String _score_player1, String _score_player2) {
        this._id = _id;
        this._player1 = _player1;
        this._player2 = _player2;
        this._score_player1 = _score_player1;
        this._score_player2 = _score_player2;
    }

    public Score(String _player1, String _player2, String _score_player1, String _score_player2) {
        this._player1 = _player1;
        this._player2 = _player2;
        this._score_player1 = _score_player1;
        this._score_player2 = _score_player2;
    }

    public String get_score_player1() {
        return _score_player1;
    }

    public void set_score_player1(String _score_player1) {
        this._score_player1 = _score_player1;
    }

    public String get_score_player2() {
        return _score_player2;
    }

    public void set_score_player2(String _score_player2) {
        this._score_player2 = _score_player2;
    }

    public String get_player2() {
        return _player2;
    }

    public void set_player2(String _player2) {
        this._player2 = _player2;
    }

    public String get_player1() {
        return _player1;
    }

    public void set_player1(String _player1) {
        this._player1 = _player1;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }
}




