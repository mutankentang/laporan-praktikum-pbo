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
public class P3_Sarjana1841720125Falah extends P3_Mahasiswa1841720125Falah 
        implements P3_ICumlaude1841720125Falah,P3_IBerprestasi1841720125Falah{
     public P3_Sarjana1841720125Falah(String nama) {
        super(nama);
    }

    
    @Override
    public void lulusFalah() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");  
    }

    @Override
    public void meraihIPKTinggiFalah() {
        System.out.println("IPK-ku lebih dari 3,51");  
    }

    @Override
    public void menjuaraiKompetisiFalah() {
        System.out.println("AUTO JUARA DUNIA DONGGG");    }

    @Override
    public void membuatPublikasiIlmiahFalah() {
        System.out.println("Saya telah menerbitkan Jurnalisa Kelas INTERNASIONAL");
    }
}
