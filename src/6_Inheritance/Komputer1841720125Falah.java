package pbojsenam;
public class Komputer1841720125Falah {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer1841720125Falah() {
    }

    public Komputer1841720125Falah(String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }
    
    public void tampilDataFalah(){
        System.out.println("Merk : " +merk);
        System.out.println("Kecepatan Prosesor : "+kecProsesor);
        System.out.println("Size Memory : "+sizeMemory);
        System.out.println("Jenis Prosesor : "+jnsProsesor);
    }    
}
