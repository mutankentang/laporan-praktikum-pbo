package pbojssembilan.abstrakclass;
public class Orang1841720125Falah {
    private String nama;
    private Hewan1841720125Falah hewanPeliharaan;

    public Orang1841720125Falah(String nama) {
        this.nama = nama;
    }


    public void peliharaHewanFalah(Hewan1841720125Falah hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakPeliharaanJalanJalanFalah(){
        System.out.println("Namaku "+this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaan.bergerakFalah();
        System.out.println("-----------------------------------------");
    }
}
