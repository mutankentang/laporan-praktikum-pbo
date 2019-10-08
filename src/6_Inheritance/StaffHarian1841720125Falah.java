package pbojsenam;
public class StaffHarian1841720125Falah extends Staff1841720125Falah{
    public int jmlJamKerja;

    public StaffHarian1841720125Falah() {
    }

    public StaffHarian1841720125Falah( String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan,int jmlJamKerja) {
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.jmlJamKerja = jmlJamKerja;
    }
    public void tampilStaffHarianFalah(){
        System.out.println("====================Data Staff Harian============");
        super.tampilDataStaffFalah();
        System.out.println("Jumlah Jam Kerja        : "+jmlJamKerja);
        System.out.println("GajiBersih             :"+(gaji*jmlJamKerja+lembur-potongan));
        }    
}
