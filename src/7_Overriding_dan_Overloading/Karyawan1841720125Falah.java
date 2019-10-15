package pbojstujuh;
public class Karyawan1841720125Falah {
       private String mNama;
    private String mNip;
    private String mGolongan;
    private double mGaji;

    public void setmNamaFalah(String mNama) {
        this.mNama = mNama;
    }
    public void setmNipFalah(String mNip) {
        this.mNip = mNip;
    }
    public void setmGolonganFalah(String mGolongan) {
        this.mGolongan = mGolongan;
        switch (mGolongan.charAt(0)) {
            case '1':
                this.mGaji = 5000000;
                break;
            case '2':
                this.mGaji = 3000000;
                break;
            case '3':
                this.mGaji = 2000000;
                break;
            case '4':
                this.mGaji = 1000000;
                break;
            case '5':
                this.mGaji = 750000;
                break;
        }
    }
    public void setmGajiFalah(double mGaji) {
        this.mGaji = mGaji;
    }
    public String getmNamaFalah() {
        return mNama;
    }
    public String getmNipFalah() {
        return mNip;
    }
    public String getmGolonganFalah() {
        return mGolongan;
    }
    public double getmGajiFalah() {
        return mGaji;
    }
}
