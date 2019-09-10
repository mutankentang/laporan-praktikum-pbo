package pbojsdua;
public class TestMahasiswa1841720125Falah {
    public static void main(String[] args) {
        Mahasiswa1841720125Falah mhs1=new Mahasiswa1841720125Falah();
        
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl.Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tampilanBiodataFalah();
        System.out.println("-----------------------------");
        mhs1.nim=102;
        mhs1.nama="Alam";
        mhs1.alamat="Jl. Mawar No 2A";
        mhs1.kelas="1B";
        mhs1.tampilanBiodataFalah();
    }
}
