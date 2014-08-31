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
public class CardGameRole{
    
    private String name, description, role;
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
    
    public CardGameRole(String name, String description, String role, int healthPointBonus){
        
        this.name = name;
        this.description = description;
        this.role = role;
        this.healthPointBonus = healthPointBonus;
    }
    
    public CardGameRole(String[] split) {
        this.name = split[0];
        this.description = split[1];
        this.role = split[2];
        this.healthPointBonus = Integer.parseInt(split[3]);
    }
    
    @Override
    public String toString(){
        return name;
    }
}
