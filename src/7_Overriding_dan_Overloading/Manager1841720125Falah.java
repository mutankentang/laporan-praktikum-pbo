package pbojstujuh;
public class Manager1841720125Falah extends Karyawan1841720125Falah{ 
    private double mTunjangan;
    private String mBagian;
    private Staff1841720125Falah st[];

    public void setmTunjanganFalah(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public double getmTunjanganFalah() {
        return mTunjangan;
    }

    public void setmBagianFalah(String mBagian) {
        this.mBagian = mBagian;
    }

    public String getmBagianFalah() {
        return mBagian;
    }

    public void setStFalah(Staff1841720125Falah[] st) {
        this.st = st;
    }

    void viewStaff1841720125Falah() {
        int i;
        System.out.println("------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfoFalah();
        }
        System.out.println("------------");
    }

    void lihatInfoFalah() {
        System.out.println("Manager : " + this.getmBagianFalah());
        System.out.println("NIP : " + this.getmNipFalah());
        System.out.println("Nama : " + this.getmNamaFalah());
        System.out.println("Golongan : " + this.getmGolonganFalah());
        System.out.printf("Tunjangan :%.0f\n", this.getmTunjanganFalah());
        System.out.printf("Gaji : %.0f\n", this.getmGajiFalah());
        System.out.println("Bagian : " + this.getmBagianFalah());
        this.viewStaff1841720125Falah();
    }

    double getGajiFalah() {
        return super.getmGajiFalah() + mTunjangan;
    }
}
