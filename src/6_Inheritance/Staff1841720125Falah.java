package pbojsenam;
public class Staff1841720125Falah extends Karyawan1841720125Falah{
      public int lembur, potongan;

    public Staff1841720125Falah() {
    }

    public Staff1841720125Falah(int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaffFalah(){
        super.tampilDataKaryawanFalah();
        System.out.println("Lembur : "+lembur);
        System.out.println("Potongan : "+potongan);
        System.out.println("Total Gaji : "+(gaji+lembur-potongan));
    }
}
