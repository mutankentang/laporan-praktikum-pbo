/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbojssembilan.interfaceImplementation;

/**
 *
 * @author sepuluh
 */
public class P3_Mahasiswa1841720125Falah implements P3_ICumlaude1841720125Falah{
        protected String nama;

    public P3_Mahasiswa1841720125Falah(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void lulusFalah() {
        System.out.println("BISMILLAH TERBAIK"); 
    }

    @Override
    public void meraihIPKTinggiFalah() {
        System.out.println("LEBIH DARI 3,5"); 
    }
    
    public void kuliahDikampusFalah(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
}
