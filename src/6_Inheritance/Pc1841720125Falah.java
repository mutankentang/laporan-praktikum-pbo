package pbojsenam;
public class Pc1841720125Falah extends Komputer1841720125Falah{
    public int ukuranMonitor;

    public Pc1841720125Falah() {
    }

    public Pc1841720125Falah(int ukuranMonitor, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilDataPcFalah(){
        super.tampilDataFalah();
        System.out.println("Ukuran Monitor : "+ukuranMonitor);
    }
}
