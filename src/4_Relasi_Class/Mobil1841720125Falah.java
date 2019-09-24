package pbojsempat;
public class Mobil1841720125Falah {
    private String nama;
    private int biaya;

    public Mobil1841720125Falah() {
    }

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
    
    public int hitungBiayaMobilFalah(int hari){
        return biaya*hari;
    }
}
