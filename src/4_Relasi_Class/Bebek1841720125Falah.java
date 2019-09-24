package pbojsempat;
public class Bebek1841720125Falah {
    private int berat,umur,harga;
    private String fisik;

    public Bebek1841720125Falah() {
    }

    public Bebek1841720125Falah(int berat, int umur, int harga, String fisik) {
        this.berat = berat;
        this.umur = umur;
        this.harga = harga;
        this.fisik = fisik;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getFisik() {
        return fisik;
    }

    public void setFisik(String fisik) {
        this.fisik = fisik;
    }
    public void cetakBebekFalah(){
    System.out.println("--------------------------------------------------------------------------------");
    System.out.println("Anda Akaan Membeli Ternak Jenis Bebek dengan ketentuan Sebagai Berikut : "); 
    System.out.println("Berat "+berat+" Kg"); 
    System.out.println("Umur  "+umur+" Thn"); 
    System.out.println("Fisik "+fisik); 
    System.out.println("Harga "+harga); 
    System.out.println("Terimakasih telah Membeli dan percaya pada Peternakan Kami!");
    }
}
