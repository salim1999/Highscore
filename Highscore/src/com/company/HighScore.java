package com.company;

/**
 * Created by brian on 19.01.2018.
 */
public class HighScore {
    String name;
    String datTime;
    String level;
    int finishtime;
    HighScore(String name, String dateTime, String level, int finishTime){
        this.name = name;
        this.datTime = dateTime;
        this.level = level;
        this.finishtime = finishTime;
    }
    HighScore(){}
}
