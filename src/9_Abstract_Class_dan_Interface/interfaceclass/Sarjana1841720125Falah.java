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
public class Sarjana1841720125Falah extends Mahasiswa1841720125Falah implements ICumlaude1841720125Falah{
        public Sarjana1841720125Falah(String nama) {
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
    
}
