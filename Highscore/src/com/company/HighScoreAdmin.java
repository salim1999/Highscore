package com.company;

/**
 * Created by brian on 19.01.2018.
 */
public class HighScoreAdmin {

    String submit(String name, String dateTime, String level, int finishTime){

        String saveMessage = save(new HighScore(name, dateTime, level, finishTime));

    }

    HighScore[] getHighScored(String level){
        load();
    }

    String save(HighScore hs){
        HighScore[] highScores = load();
        
    }

    HighScore[] load(){

    }
}
