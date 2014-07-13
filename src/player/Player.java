/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package player;

import card.Card;
import card.CardGameRole;
import java.util.ArrayList;

/**
 *
 * @author MKSJ
 */
public class Player {
    
   private CardGameRole role;
   private String name;
   private int healthPoint;
   private ArrayList<Card> deck;
   private ArrayList<Card> hand;
   private int distance, range;
   
   
   public Player(String name, CardGameRole role, ArrayList<Card> deck){
       this.name = name;
       this.role = role;
       this.deck = deck;
       this.distance = 0;
       this.range = 0;
       this.hand = new ArrayList<>();
       for(int i = 0; i < 4; i++){
           this.pickUp();
       }
   }

    public void pickUp() {
        hand.add(deck.remove(1));
    }
}
