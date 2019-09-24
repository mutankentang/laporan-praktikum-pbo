package pbojsempat;
public class KeretaApi1841720125Falah {
    private String mNama;
    private String mKelas;
    private Pegawai1841720125Falah mMasinis;
    private Pegawai1841720125Falah mAsisten;

    public KeretaApi1841720125Falah() {
    }
    
    public KeretaApi1841720125Falah(String mNama, String mKelas, Pegawai1841720125Falah mMasinis) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
    }

    public KeretaApi1841720125Falah(String mNama, String mKelas, Pegawai1841720125Falah mMasinis, Pegawai1841720125Falah mAsisten) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
        this.mAsisten = mAsisten;
    }

    KeretaApi1841720125Falah(String gaya_Baru_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public void setmKelas(String mKelas) {
        this.mKelas = mKelas;
    }

    public void setmMasinis(Pegawai1841720125Falah mMasinis) {
        this.mMasinis = mMasinis;
    }

    public void setmAsisten(Pegawai1841720125Falah mAsisten) {
        this.mAsisten = mAsisten;
    }

    public String getmNama() {
        return mNama;
    }

    public String getmKelas() {
        return mKelas;
    }

    public Pegawai1841720125Falah getmMasinis() {
        return mMasinis;
    }

    public Pegawai1841720125Falah getmAsisten() {
        return mAsisten;
    }
    
    public String info(){
        String info = "";
        info += "Nama : "+this.mNama+"\n";
        info += "Kelas : "+this.mKelas+"\n\n";
        info += "Masinis :\n"+this.mMasinis.info()+"\n";
        info += "Asisten :\n"+this.mAsisten.info()+"\n";
        return info;
    }
}

