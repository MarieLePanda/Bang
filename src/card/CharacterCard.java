/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package card;

/**
 *
 * @author Lucas
 */
public class CharacterCard {
    
    private String name, description;
    private int healthPoint;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
    
    public CharacterCard(String name, String description, int healthPoint){
        this.name = name;
        this.description = description;
        this.healthPoint = healthPoint;
    }
    
    public CharacterCard(String[] split){
        this.name = split[0];
        this.description = split[1];
        this.healthPoint = Integer.parseInt(split[2]);
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
