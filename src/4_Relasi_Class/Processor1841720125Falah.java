package pbojsempat;
public class Processor1841720125Falah {
    private String merk;
    private double cache;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public Processor1841720125Falah(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public Processor1841720125Falah() {
    }
    
    public void info(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
