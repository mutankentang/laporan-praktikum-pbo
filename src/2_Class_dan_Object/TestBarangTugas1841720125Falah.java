package pbojsdua;
public class TestBarangTugas1841720125Falah {
    public static void main(String[] args) {
     BarangTugas1841720125Falah bt1=new BarangTugas1841720125Falah();
     
     bt1.kode="181";
     bt1.namaBarang="SUNSLIKS";
     bt1.hargaDasar=5000;
     bt1.diskon=50;
     bt1.tampilDataFalah();
        System.out.println("----------------------------------------------------");
        System.out.println("Harga Setelah Di Diskon Adalah : "+ bt1.hitungHargaJualFalah());
    }   
}
