package pbojsempat;
public class Pelanggan1841720125Falah {
    private String nama;
    private Mobil1841720125Falah mobil;
    private Sopir1841720125Falah sopir;
    private int hari;

    public Pelanggan1841720125Falah() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mobil1841720125Falah getMobil() {
        return mobil;
    }

    public void setMobil(Mobil1841720125Falah mobil) {
        this.mobil = mobil;
    }

    public Sopir1841720125Falah getSopir() {
        return sopir;
    }

    public void setSopir(Sopir1841720125Falah sopir) {
        this.sopir = sopir;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }
    
    public int hitungBiayaTotalFalah(){
        return mobil.hitungBiayaMobilFalah(hari)+
                sopir.hitungBiayaSopirFalah(hari);
    }
}
