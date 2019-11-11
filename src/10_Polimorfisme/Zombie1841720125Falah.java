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
public abstract class Zombie1841720125Falah implements Destroyable1841720125Falah{
    protected int health;    
    protected int level;     
    
    public String getZombieInfoFalah(){  
        return "\nHealth = "+health+"\nLevel = "+level;
    }         
    public abstract void healFalah();    
    @Override    
    public abstract void destroyedFalah(); 
    
}
