package pbojsenam;
public class Karyawan1841720125Falah {
    public String nama,alamat,jk;
    public int umur, gaji;

    public Karyawan1841720125Falah() {
    }

    public Karyawan1841720125Falah(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }
    
    public void tampilDataKaryawanFalah(){
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("JenisKelamin : "+jk);
        System.out.println("Umur : "+umur);
        System.out.println("Gaji : "+gaji);
        
    }
}
