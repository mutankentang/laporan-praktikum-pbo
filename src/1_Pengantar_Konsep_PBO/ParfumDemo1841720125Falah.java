package pbojssatu;

/**
 *
 * @author sepuluh
 */
public class ParfumDemo1841720125Falah {
    public static void main(String[] args) {
        Parfum1841720125Falah        p1 = new Parfum1841720125Falah();
        ParfumMobil1841720125Falah   p2 = new ParfumMobil1841720125Falah();
        ParfumRuangan1841720125Falah p3 = new ParfumRuangan1841720125Falah();
        
        p1.setNama("Stella");
        p1.Aroma("Vanilla");
        p1.Isi(100);
        p1.Harga(5000);
        p1.cetak();
        System.out.println("-------------------------------------------");
        p2.setNama("Baygon");
        p2.Aroma("Dark Coklat");
        p2.Isi(500);
        p2.Tipe("Tempel");
        p2.Harga(15000);
        p2.cetak();
        System.out.println("-------------------------------------------");
        p3.setNama("Vape");
        p3.Aroma("Caramel");
        p3.Isi(250);
        p3.jenisParfum("Cair");
        p3.Harga(8000);
        p3.cetak();
    }
    
}
