package pbojssatu;
public class Parfum1841720125Falah {
    private String Nama;
    private String Aroma;
    private int Isi;
    private int Harga;
    
    
    public void setNama(String newValue){
        Nama=newValue;
    }
    public void Aroma(String newValue){
        Aroma=newValue;
    }
    public void Isi(int ml){
        Isi=ml;
    }
    public void Harga(int harga){
        Harga=harga*Isi;
    }
     public void cetak()
    {
        System.out.println("Nama: " + Nama);
        System.out.println("Aroma: " + Aroma);
        System.out.println("Isi: " + Isi +" ml");
        System.out.println("Harga: Rp. " +Harga );
    }
}
