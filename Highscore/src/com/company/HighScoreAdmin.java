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
        return "";
    }
    HighScore[] getHighScored(String level){
return null;
    }

    void save(){}

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


    }
}
