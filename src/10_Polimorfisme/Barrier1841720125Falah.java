/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbojssepuluh;

/**
 *
 * @author sepuluh
 */
public class Barrier1841720125Falah implements Destroyable1841720125Falah{
        private int strength;
    
    public Barrier1841720125Falah (int strength){
        this.strength = strength;
    }
    public void setStrengthFalah (int strength){
        this.strength = strength;
    }
    public int getStrengthFalah (){
        return strength;
    } 
    public void destroyFalah(){
        strength -= strength*0.1;
    }  
    public void destroyedFalah(){
        destroyFalah();
    }
    public String getBarrierInfoFalah(){
        return "Barrier Strength = "+strength+"\n";
    }
}
