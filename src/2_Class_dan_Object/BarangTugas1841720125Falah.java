package pbojsdua;
public class BarangTugas1841720125Falah {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;
    
    public int hitungHargaJualFalah(){
       return(int) (hargaDasar-(diskon*hargaDasar)/100);
    }
    
    public void tampilDataFalah(){
        System.out.println("Kode        :"+kode);
        System.out.println("Nama Barang :"+namaBarang);
        System.out.println("Harga Dasar :"+hargaDasar);
        System.out.println("Diskon      :"+diskon+"%");
    }
}