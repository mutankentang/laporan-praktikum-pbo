package pbojstiga;
public class Anggota1841720125Falah {
    private String nama;
    private String alamat;
    private float simpanan;
    
    Anggota1841720125Falah(String nama, String alamat){
        this.nama=nama;
        this.alamat=alamat;
        this.simpanan=0;
    }
    
    public void setNamaFalah(String nama){
        this.nama = nama;
    }
    public void setAlamatFalah(String alamat){
        this.alamat = alamat;
    }
    public String getNamaFalah(){
        return nama;
    }
    public String getAlamatFalah(){
        return alamat;
    }
    public float getSimpananFalah(){
        return simpanan;
    }
    public void setorFalah(float uang){
        simpanan += uang;
    }
    public void pinjamFalah (float uang){
        simpanan -= uang;
    }
}