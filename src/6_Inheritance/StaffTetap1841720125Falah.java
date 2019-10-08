package pbojsenam;
public class StaffTetap1841720125Falah extends Staff1841720125Falah{
     public String golongan;
    public int asuransi;

    public StaffTetap1841720125Falah() {
    }

    public StaffTetap1841720125Falah (String nama,String alamat, String jk, int umur,int gaji, int lembur, int potongan, String golongan, int asuransi){
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.golongan=golongan;
        this.asuransi=asuransi;
    }

    
    public void tampilStaffTetapFalah(){
        System.out.println("================Data Staff Tetap============");
        super.tampilDataStaffFalah();
        System.out.println("Golongan             : "+golongan);
        System.out.println("JumlahAngsuransi   : "+asuransi);
        System.out.println("GajiBersih         : "+(gaji+lembur-potongan-asuransi));
    }
}
