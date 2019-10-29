/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbojssembilan.abstrakclass;

/**
 *
 * @author sepuluh
 */
public class MainProgram1841720125Falah {
    public static void main(String[] args) {
        Kucing1841720125Falah Kucingkampung = new Kucing1841720125Falah();
        Ikan1841720125Falah Lumbalumba = new Ikan1841720125Falah();
        
        Orang1841720125Falah ani = new Orang1841720125Falah("Ani");
        Orang1841720125Falah Budi = new Orang1841720125Falah("Budi");
        
        ani.peliharaHewanFalah(Kucingkampung);
        Budi.peliharaHewanFalah(Lumbalumba);
        
        
        ani.ajakPeliharaanJalanJalanFalah();
        Budi.ajakPeliharaanJalanJalanFalah();
        
    }
}
