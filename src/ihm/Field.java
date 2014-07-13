/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ihm;

import java.util.LinkedList;
import player.Player;

/**
 *
 * @author MKSJ
 */
public class Field {
    public static Player pOne, pTwo, pThree, pFour, pFive, pSix, PSeven;
    public static LinkedList<Player> PlayerList;
    
    public static void initField(){
        initPlayer();
    }
    
}
