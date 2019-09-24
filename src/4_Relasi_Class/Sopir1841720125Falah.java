package pbojsempat;
public class Sopir1841720125Falah {
    private String nama;
    private int biaya;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public Sopir1841720125Falah() {
    }
    
    
    
   public int hitungBiayaSopirFalah(int hari){
       return biaya * hari;
   }
}
