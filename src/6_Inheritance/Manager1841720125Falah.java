package pbojsenam;
public class Manager1841720125Falah extends Karyawan1841720125Falah{
     public int tunjangan;

    public Manager1841720125Falah() {
    }
    
    public void tampilDataManagerFalah(){
        super.tampilDataKaryawanFalah();
        System.out.println("Tunjangan : "+tunjangan);
        System.out.println("Total Gaji : "+(super.gaji+tunjangan));
       
    }
}
