package pbojstiga;
public class KoperasiDemo1841720125Falah {
    public static void main(String[] args) {
        Anggota1841720125Falah anggota1= new Anggota1841720125Falah("Iwan","Jalan Mawar");
        System.out.println("Simpanan "+ anggota1.getNamaFalah()+" : Rp. " + anggota1.getSimpananFalah());
        
        anggota1.setNamaFalah("Iwan Setiawan");
        anggota1.setAlamatFalah("Jalan Sukarno Hatta No 10");
        anggota1.setorFalah(100000);
        System.out.println("Simpanan "+ anggota1.getNamaFalah()+" : Rp. " + anggota1.getSimpananFalah());
        
        anggota1.pinjamFalah(5000);
        System.out.println("Simpanan "+ anggota1.getNamaFalah()+" : Rp. "+anggota1.getSimpananFalah());
    }   
}