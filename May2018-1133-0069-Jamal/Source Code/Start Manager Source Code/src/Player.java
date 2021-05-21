/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tanim
 */
import java.io.*;
public class Player implements Serializable{
    
    String fName;
    String lName;
    //int height;
    int totalGames;
    int jerseyNumber;
    int rebounds;
    int assist;
    String position;
    int points;

    public Player(String f, String l, int totalg, int jN, int re, int as, String pos, int pt){
        fName = f;
        lName = l;
        totalGames = totalg;
        jerseyNumber = jN;
        rebounds = re;
        assist = as;
        position = pos;
        points = pt;
    }
    
}
