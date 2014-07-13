/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package card;

/**
 *
 * @author MKSJ
 */
public class CardGameRole extends Card{
    
    private String role;
    private int healthPointBonus;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getHealthPointBonus() {
        return healthPointBonus;
    }

    public void setHealthPointBonus(int healthPointBonus) {
        this.healthPointBonus = healthPointBonus;
    }
    
    public CardGameRole(String name, String description, String color, String symbol, int number, String role, int healthPointBonus){
        
        this.name = name;
        this.description = description;
        this.color = color;
        this.symbol = symbol;
        this.number = number;
        this.role = role;
        this.healthPointBonus = healthPointBonus;
    }
    
    public CardGameRole(String[] split) {
        this.name = split[0];
        this.description = split[1];
        this.color = split[2];
        this.symbol = split[3];
        this.number = Integer.getInteger(split[4]);
        this.role = split[5];
        this.healthPointBonus = Integer.getInteger(split[6]);
    }
}
