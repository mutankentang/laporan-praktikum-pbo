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
public class P3_MahasiswaMain1841720125Falah {
    public static void main(String[] args) {
     P3_Rektor1841720125Falah pakRektor = new P3_Rektor1841720125Falah();
        
        //P3_Mahasiswa1841720146Bagus MahasiswaBiasa = new P3_Mahasiswa1841720146Bagus("Charlie");
        P3_Sarjana1841720125Falah sarjanaCumlaude = new P3_Sarjana1841720125Falah("Dini");
        P3_PascaSarjana1841720125Falah masterCumlaude = new P3_PascaSarjana1841720125Falah("Elok");
        
        //MahasiswaBiasa.kuliahDikampusBagus();
        //pakRektor.beriSertifikatCumlaude(masterCumlaude);
        //sarjanaCumlaude.kuliahDikampusBagus();
        //pakRektor.beriSertifikatCumlaude(MahasiswaBiasa);
        //masterCumlaude.kuliahDikampusBagus();
        //pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        
        pakRektor.beriSertifikatMawapresFalah(masterCumlaude);
        pakRektor.beriSertifikatMawapresFalah(sarjanaCumlaude);   
    }
}
