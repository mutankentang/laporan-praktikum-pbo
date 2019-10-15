package pbojstujuh;
public class Staff1841720125Falah extends Karyawan1841720125Falah{
         private int mLembur;
    private double mGajiLembur;

    public void setmLemburFalah(int mLembur) {
        this.mLembur = mLembur;
    }

    public int getmLemburFalah() {
        return mLembur;
    }

    public void setmGajiLemburFalah(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }

    public double getmGajiLemburFalah() {
        return mGajiLembur;
    }

    double getmGajiFalah(int lembur, double gajiLembur) {
        return super.getmGajiFalah() + lembur * gajiLembur;
    }

    @Override
    public double getmGajiFalah() {
        return super.getmGajiFalah() + mLembur * mGajiLembur;
    }

    void lihatInfoFalah() {
        System.out.println("NIP : "+this.getmNipFalah());
        System.out.println("Nama : "+this.getmNamaFalah());
        System.out.println("Golongan : "+this.getmGolonganFalah());
        System.out.println("Jml Lembur : "+this.getmLemburFalah());
        System.out.printf("Gaji Lembur :%.0f\n",this.getmGajiLemburFalah());
        System.out.printf("Gaji :%.0f\n",this.getmGajiFalah());
    }

}
