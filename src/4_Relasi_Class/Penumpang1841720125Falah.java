package pbojsempat;
public class Penumpang1841720125Falah {
        private String mKtp, mNama;

    public Penumpang1841720125Falah(String mKtp, String mNama) {
        this.mKtp = mKtp;
        this.mNama = mNama;
    }

    public void setmKtpFalah(String mKtp) {
        this.mKtp = mKtp;
    }

    public void setmNamaFalah(String mNama) {
        this.mNama = mNama;
    }

    public String getmKtpFalah() {
        return mKtp;
    }

    public String getmNamaFalah() {
        return mNama;
    }
    
    public String infoFalah(){
        String infoFalah = " ";
        infoFalah += "KTP : " +mKtp+ "\n";
        infoFalah += "Nama : " +mNama+ "\n";
        return infoFalah;
    }
}
