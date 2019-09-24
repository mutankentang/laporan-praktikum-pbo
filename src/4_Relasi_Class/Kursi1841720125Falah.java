package pbojsempat;
public class Kursi1841720125Falah {
    private String mNomor;
    private Penumpang1841720125Falah mPenumpang;

    public Kursi1841720125Falah(String mNomor) {
        this.mNomor = mNomor;
    }

    public void setmNomorFalah(String mNomor) {
        this.mNomor = mNomor;
    }

    public void setmPenumpangFalah(Penumpang1841720125Falah mPenumpang) {
        this.mPenumpang = mPenumpang;
    }

    public String getmNomorFalah() {
        return mNomor;
    }

    public Penumpang1841720125Falah getmPenumpang() {
        return mPenumpang;
    }
     
    public String infoFalah(){
        String infoFalah = "";
        infoFalah += "Nomor : " + mNomor + "\n";
        if(this.mPenumpang != null){
            infoFalah += "Penumpang : \n"+mPenumpang.infoFalah()+ "\n";
        }
        return infoFalah;
}
}