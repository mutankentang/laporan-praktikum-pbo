/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbojssembilan.interfaceclass;

/**
 *
 * @author sepuluh
 */
public class MahasiswaMain1841720125Falah {
    public static void main(String[] args) {
        Rektor1841720125Falah pakRektor = new Rektor1841720125Falah();
        
        Mahasiswa1841720125Falah MahasiswaBiasa = new Mahasiswa1841720125Falah("Charlie");
        Sarjana1841720125Falah sarjanaCumlaude = new Sarjana1841720125Falah("Dini");
        PascaSarjana1841720125Falah masterCumlaude = new PascaSarjana1841720125Falah("Elok");
        
//        MahasiswaBiasa.kuliahDikampusFalah();
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);
//        sarjanaCumlaude.kuliahDikampusFalah();
//        pakRektor.beriSertifikatCumlaude(MahasiswaBiasa);
//        masterCumlaude.kuliahDikampusFalah();
        
    }
}
