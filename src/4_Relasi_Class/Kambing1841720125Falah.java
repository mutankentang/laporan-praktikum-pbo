package pbojsempat;
public class Kambing1841720125Falah {
    private int berat,umur,harga;
    private String fisik,jenis;

    public Kambing1841720125Falah(int berat, int umur, int harga, String fisik, String jenis) {
        this.berat = berat;
        this.umur = umur;
        this.harga = harga;
        this.fisik = fisik;
        this.jenis = jenis;
    }

    public Kambing1841720125Falah() {
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

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public void cetakKambingFalah(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Anda Akaan Membeli Ternak Jenis Kambing dengan ketentuan Sebagai Berikut : "); 
        System.out.println("Berat "+berat+" Kg"); 
        System.out.println("Umur  "+umur+" Thn"); 
        System.out.println("Fisik "+fisik); 
        System.out.println("Jenis "+jenis); 
        System.out.println("Harga "+harga); 
        System.out.println("Terimakasih telah Membeli dan percaya pada Peternakan Kami!");
    }
}
