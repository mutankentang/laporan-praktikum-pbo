package pbojsempat;
public class Gerbong1841720125Falah {
        private String mKode;
    private Kursi1841720125Falah[] mArrayKursi;

    public Gerbong1841720125Falah(String mKode, int jumlah) {
        this.mKode = mKode;
        this. mArrayKursi = new Kursi1841720125Falah[jumlah];
        this.initKursiFalah();
    }

    public void setmKodeFalah(String mKode) {
        this.mKode = mKode;
    }

    public void setmArrayKursiFalah(Kursi1841720125Falah[] mArrayKursi) {
        this.mArrayKursi = mArrayKursi;
    }

    public String getmKodeFalah() {
        return mKode;
    }

    public Kursi1841720125Falah[] getmArrayKursiFalah() {
        return mArrayKursi;
    }
    
    private void initKursiFalah(){
        for(int i=0; i<mArrayKursi.length; i++){
            this.mArrayKursi[i] = new Kursi1841720125Falah(String.valueOf(i+1));
        }
    }
    
    public String infoFalah(){
        String infoFalah ="";
        infoFalah += "Kode ; " + mKode + "\n";
        for(Kursi1841720125Falah kursi : mArrayKursi){
            infoFalah += kursi.infoFalah();
        }
        return infoFalah;
    }
    
    public void setPenumpangFalah(Penumpang1841720125Falah penumpang, int nomor){
        //pertanyaan percobaan 4 nomer 5 
        if(mArrayKursi[nomor-1].getmPenumpang()==null){
            this.mArrayKursi[nomor-1].setmPenumpangFalah(penumpang);
        }else{
            System.out.println("Tempat Terpenuhi : ");
            System.out.println(penumpang.infoFalah());
            System.out.println("Nomor : "+nomor);
        }
        
    }
}