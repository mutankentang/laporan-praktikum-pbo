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
public class WalkingZombie1841720125Falah extends Zombie1841720125Falah{
        public WalkingZombie1841720125Falah(int health, int level){
        this.health = health;
        this.level = level;
    }
    public void healFalah(){
        if (level == 1){
            health += health*0.2;
        }else if (level == 2){
            health += health*0.3;
        }else if (level == 3){
            health += health*0.4;
        }
    }   
    public void destroyedFalah(){
        health -= health*0.19;
    }
    public String getZombieInfoFalah(){
        String info = "Walking Zombie Data = ";
        info += super.getZombieInfoFalah()+"\n";
        return info;
    }  
}