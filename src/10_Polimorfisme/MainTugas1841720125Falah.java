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
public class MainTugas1841720125Falah {
        public static void main(String[] args) {
        WalkingZombie1841720125Falah wz = new WalkingZombie1841720125Falah(100,1);
        JumpingZombie1841720125Falah jz = new JumpingZombie1841720125Falah(100,2);
        Barrier1841720125Falah b = new Barrier1841720125Falah (100);
        Plant1841720125Falah p = new Plant1841720125Falah();
        System.out.println(""+wz.getZombieInfoFalah());
        System.out.println(""+jz.getZombieInfoFalah());
        System.out.println(""+b.getBarrierInfoFalah());
        System.out.println("---------------------");
        for (int i = 0; i<4; i++){
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(""+wz.getZombieInfoFalah());
        System.out.println(""+jz.getZombieInfoFalah());
        System.out.println(""+b.getBarrierInfoFalah());
    } 
}
