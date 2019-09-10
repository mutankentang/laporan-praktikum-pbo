package pbojsdua;
public class TestBarang1841720125Falah {
    public static void main(String[] args) {
        Barang1841720125Falah brg1=new Barang1841720125Falah();
        
        brg1.namaBrg="Pensil";
        brg1.jenisBrg="ATK";
        brg1.stok=10;
        brg1.tampilBarangFalah();
        
        System.out.println("Stok Baru Adalah "+brg1.tambahStokFalah(20));
    }
}
