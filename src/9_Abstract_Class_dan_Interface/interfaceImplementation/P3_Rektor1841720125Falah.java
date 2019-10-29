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
public class P3_Rektor1841720125Falah {
    public void beriSertifikatCumlaudeFalah(P3_ICumlaude1841720125Falah P3_Mahasiswa1841720125Falah){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");
        
        P3_Mahasiswa1841720125Falah.lulusFalah();
        P3_Mahasiswa1841720125Falah.meraihIPKTinggiFalah();
        
        System.out.println("--------------------------------------------");
    }
    
    public void beriSertifikatMawapresFalah(P3_IBerprestasi1841720125Falah P3_Mahasiswa1841720125Falah){
        System.out.println("Saya REKTOR,memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        P3_Mahasiswa1841720125Falah.menjuaraiKompetisiFalah();
        P3_Mahasiswa1841720125Falah.membuatPublikasiIlmiahFalah();
        
        System.out.println("---------------------------------------------");
    }
}
