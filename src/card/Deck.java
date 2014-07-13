/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package card;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import card.action.BangCard;
import card.action.MissCard;

/**
 *
 * @author MKSJ
 */
public class Deck {
    
    public static ArrayList<CardGameRole> deckGameRole;
    public static ArrayList<Card> deckCard;
    
    public static void initDeckGameRole(String pathFile) throws FileNotFoundException, IOException{
        FileReader fileGameRole = new FileReader(pathFile);
        BufferedReader readerGamerole = new BufferedReader(fileGameRole);
        String line;
        while ((line = readerGamerole.readLine()) != null){
            deckGameRole.add(new CardGameRole(line.split(";")));
        } 
        fileGameRole.close();
        Collections.shuffle(deckGameRole);
    }
    
    public static void iniDeck(String pathFile) throws FileNotFoundException, IOException{
        FileReader fileGameRole = new FileReader(pathFile);
        BufferedReader readerGamerole = new BufferedReader(fileGameRole);
        String line;
        while ((line = readerGamerole.readLine()) != null){
            switch (line) {
                case "Bang":
                    deckCard.add(new BangCard());
                    break;
                case "Raté":
                    deckCard.add(new MissCard());
                    break;
            }
        } 
        fileGameRole.close();
        Collections.shuffle(deckCard);
    }
}
