package pbojsdua;
public class TestVideoGame1841720125Falah {
    public static void main(String[] args) {
        VideoGame1841720125Falah vg1=new VideoGame1841720125Falah();
        
        vg1.id=123;
        vg1.namaMember="Budi Waseso";
        vg1.namaGame="NINJA HATORI";
        vg1.harga=80000;
        vg1.lamaSewa=2;
        vg1.dataPeminjamanFalah();
        System.out.println("---------------------------------------------");
        System.out.println("Harga yang harus dibayar    :"+vg1.totalHargaFalah());
    }
    
}
