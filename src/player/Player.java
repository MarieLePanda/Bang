/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package player;

import card.Card;
import card.CardGameRole;
import card.CharacterCard;
import card.WeaponCard;
import java.util.ArrayList;

/**
 *
 * @author MKSJ
 */
public class Player {
    
   private CardGameRole role;
   private CharacterCard charactere;
   private WeaponCard weapon;
   private String name;
   private int healthPoint;
   private ArrayList<Card> deck;
   private ArrayList<Card> hand;
   private int distance, range;

    public CardGameRole getRole() {
        return role;
    }

    public void setRole(CardGameRole role) {
        this.role = role;
    }

    public CharacterCard getCharactere() {
        return charactere;
    }

    public void setCharactere(CharacterCard charactere) {
        this.charactere = charactere;
    }

    public WeaponCard getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponCard weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
   
   
   public Player(String name, CardGameRole role, CharacterCard charactere, WeaponCard weapon, ArrayList<Card> deck){
       this.name = name;
       this.role = role;
       this.charactere = charactere;
       this.weapon = weapon;
       this.deck = deck;
       this.distance = 0;
       this.range = weapon.getRange();
       healthPoint = (charactere.getHealthPoint() + role.getHealthPointBonus());
       this.hand = new ArrayList<>();
       for(int i = 0; i < 2; i++){
           this.pickUp();
       }
   }

    public void pickUp() {
        hand.add(deck.remove(0));
    }

    @Override
    public String toString() {
        return "Player{name=" + name + "role=" + role + ", charactere=" + charactere + ", weapon=" + weapon + ", healthPoint=" + healthPoint + ", deck=" + deck + ", hand=" + hand + ", distance=" + distance + ", range=" + range + '}';
    }
    
}
