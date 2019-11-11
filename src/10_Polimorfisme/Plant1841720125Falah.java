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
public class Plant1841720125Falah {
        public void doDestroy (Destroyable1841720125Falah d){
        if (d instanceof WalkingZombie1841720125Falah){
            WalkingZombie1841720125Falah wz = (WalkingZombie1841720125Falah) d;
            wz.destroyedFalah();
        }else if (d instanceof JumpingZombie1841720125Falah){
            JumpingZombie1841720125Falah jz = (JumpingZombie1841720125Falah) d;
            jz.destroyedFalah();
        }else if (d instanceof Barrier1841720125Falah){
            Barrier1841720125Falah b = (Barrier1841720125Falah) d;
            b.destroyedFalah();
        }
    }
}
