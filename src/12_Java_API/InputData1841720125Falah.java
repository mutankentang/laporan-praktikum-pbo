package falah.percobaan4;
import java.util.ArrayList;
public class InputData1841720125Falah {
    ArrayList<Mahasiswa1841720125Falah> ListMahasiswa;
    
    public InputData1841720125Falah(){
        ListMahasiswa= new ArrayList();
    }
    
    public void isiData(String Nim, String Nama, String Alamat){
        Mahasiswa1841720125Falah mhs = new Mahasiswa1841720125Falah(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720125Falah> getData(){
        return ListMahasiswa;
    }
}
