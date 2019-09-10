package pbojsdua;
public class VideoGame1841720125Falah {
  public int id;
  public int harga;
  public int lamaSewa;
  public String namaMember;
  public String namaGame;
    
    public void dataPeminjamanFalah(){
        System.out.println("Id          : "+id);
        System.out.println("nama Member : "+namaMember);
        System.out.println("Nama Game   : "+namaGame);
        System.out.println("Harga       : "+harga);
        System.out.println("Lama Sewa   : "+lamaSewa+" Hari");
    }
    
    public int totalHargaFalah(){
        return harga*lamaSewa;
    }
    
    
}
