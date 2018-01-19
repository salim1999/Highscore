package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by brian on 19.01.2018.
 */
public class HighScoreAdmin {

    String submit(String name, String dateTime, String level, int finishTime){

        String saveMessage = save(new HighScore(name, dateTime, level, finishTime));

    }
<<<<<<< HEAD
    HighScore[] getHighScored(String level){
return null;
=======

    HighScore[] getHighScored(String level){
        load();
>>>>>>> e23f2c0cbc2f03f3efdcee88e66256525aff54c1
    }

    String save(HighScore hs){
        HighScore[] highScores = load();
        
    }

<<<<<<< HEAD
  public String[]  load(String Path){

        String csvFile = Path;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
      String[] Statistic = new String[101];
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                 Statistic = line.split(cvsSplitBy);



            }
            return Statistic;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

=======
    HighScore[] load(){
>>>>>>> e23f2c0cbc2f03f3efdcee88e66256525aff54c1

    }
}
