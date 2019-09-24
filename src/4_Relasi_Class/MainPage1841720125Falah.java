package pbojsempat;
public class MainPage1841720125Falah {
    public static void main(String[] args) {
        
        Sapi1841720125Falah sapi = new Sapi1841720125Falah();
        sapi.setBerat(500);
        sapi.setFisik("Sehat");
        sapi.setUmur(5);
        sapi.setHarga(600000);
        sapi.cetakSapiFalah();
        
        Kambing1841720125Falah kam=new Kambing1841720125Falah();
        kam.setJenis("Etawa");
        kam.setBerat(150);
        kam.setFisik("Sehat");
        kam.setUmur(3);
        kam.setHarga(3500000);
        kam.cetakKambingFalah();
        
        Ayam1841720125Falah ay=new Ayam1841720125Falah();
        ay.setJenis("Bangkok");
        ay.setJenisKelamin("Jantan");
        ay.setFisik("Sehat");
        ay.setBerat(3);
        ay.setUmur(1);
        ay.setHarga(250000);
        ay.cetakAyamFalah();
        
        Bebek1841720125Falah be=new Bebek1841720125Falah();
        be.setBerat(2);
        be.setFisik("Sehat");
        be.setUmur(1);
        be.setHarga(75000);
        be.cetakBebekFalah();
    }
}
