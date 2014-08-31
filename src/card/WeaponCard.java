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
public class WeaponCard extends Card{
    
    private int range;

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
    
    
    public WeaponCard(String name, String description, String color, String symbol, int number, int range){
        this.name = name;
        this.description = description;
        this.color = color;
        this.symbol = symbol;
        this.number = number;
        this.range = range;
    } 
    
    public WeaponCard(String[] split){
        this.name = split[0];
        this.description = split[1];
        this.color = split[2];
        this.symbol = split[3];
        this.number = Integer.parseInt(split[4]);
        this.range = Integer.parseInt(split[5]);
    }
    
    @Override
    public String toString(){
        return name;
    }
}
