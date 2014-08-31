/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ihm;

import card.ActionCard;
import card.WeaponCard;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import player.Player;

/**
 *
 * @author MKSJ
 */
public class Field {
    public static Player pOne, pTwo, pThree, pFour, pFive, pSix, PSeven;
    public static LinkedList<Player> playerList;
    public static ArrayList <card.CardGameRole> deckGameRole;
    public static ArrayList <card.CharacterCard> deckCharactere;
    public static ArrayList <card.Card> deckAction;
    
    public static void initField(){
        deckGameRole = new ArrayList<>();
        deckCharactere = new ArrayList<>();
        deckAction = new ArrayList<>();
        playerList = new LinkedList<>();
        try {
            initDeckGameRole();
            initDeckCharcatere();
            initDeckAction();
            initPlayer();
        } catch (IOException ex) {
            Logger.getLogger(Field.class.getName()).log(Level.SEVERE, null, ex);
        }
        test();
    }
    
    public static  void initDeckGameRole() throws FileNotFoundException, IOException{
        FileReader deckCardGameRole = new FileReader("src\\deck\\deckCardGameRole.txt");
        BufferedReader buffer = new BufferedReader(deckCardGameRole);
        String line;
        while((line = buffer.readLine()) != null){
            deckGameRole.add(new card.CardGameRole(line.split(";")));
        }
        Collections.shuffle(deckGameRole);
    }
    
    public static void initDeckCharcatere()throws FileNotFoundException, IOException{
        FileReader deckCharactereCard = new FileReader("src\\deck\\deckCharacterCard.txt");
        BufferedReader buffer = new BufferedReader(deckCharactereCard);
        String line;
        while((line = buffer.readLine()) != null){
            deckCharactere.add(new card.CharacterCard(line.split(";")));
        }
        Collections.shuffle(deckCharactere);
    }
    
    public static void initDeckAction() throws FileNotFoundException, IOException{
        FileReader deckActionCard = new FileReader("src\\deck\\deckCardAction.txt");
        BufferedReader buffer = new BufferedReader(deckActionCard);
        String line;
        while((line = buffer.readLine()) != null){
            deckAction.add(new card.ActionCard(line.split(";")));
        }
        Collections.shuffle(deckAction);
    }
    
    public static void initPlayer(){
        WeaponCard weapon = new WeaponCard("Colt .45", " ", "noir", "pique", 2, 1);
        pOne = new Player("Player one", deckGameRole.remove(0), deckCharactere.remove(0), weapon, deckAction);
        playerList.addLast(pOne);
        pTwo = new Player("Player two", deckGameRole.remove(0), deckCharactere.remove(0), weapon, deckAction);
        playerList.addLast(pTwo);
        pThree = new Player("Player three", deckGameRole.remove(0), deckCharactere.remove(0), weapon, deckAction);
        playerList.addLast(pThree);
        pFour = new Player("Player four", deckGameRole.remove(0), deckCharactere.remove(0), weapon, deckAction);
        playerList.addLast(pFour);
        pFive = new Player("Player five", deckGameRole.remove(0), deckCharactere.remove(0), weapon, deckAction);
        playerList.addLast(pFive);
        pSix = new Player("Player six", deckGameRole.remove(0), deckCharactere.remove(0), weapon, deckAction);
        playerList.addLast(pSix);
        PSeven = new Player("Player seven", deckGameRole.remove(0), deckCharactere.remove(0), weapon, deckAction);
        playerList.addLast(PSeven);
    }
    
    public static void test(){
        /*for(card.CardGameRole c : deckGameRole){
            System.out.println(c);
        }
        for(card.Card c : deckAction){
            System.out.println(c);
        }*/
        for(Player p : playerList){
            System.out.println(p);
        }
    }
}
