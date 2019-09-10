package pbojsdua;
public class Barang1841720125Falah {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarangFalah(){
        System.out.println("Nama Barang     : "+namaBrg);
        System.out.println("Jenis Barang    : "+jenisBrg);
        System.out.println("Stok            : "+stok);
    }
    
    public int tambahStokFalah(int brgMasuk){
        int stokBaru=brgMasuk + stok;
        return stokBaru;
    }
    
}
