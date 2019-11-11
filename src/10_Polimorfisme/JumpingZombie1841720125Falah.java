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
public class JumpingZombie1841720125Falah extends Zombie1841720125Falah{
        public JumpingZombie1841720125Falah (int health, int level){
        this.level = level;
        this.health = health;
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
        health -= health*0.093;
    }
    public String getZombieInfoFalah(){
        String info = "Jumping Zombie Data = ";
        info += super.getZombieInfoFalah()+"\n";
        return info;
    }
}
