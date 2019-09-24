package pbojsempat;
public class Laptop1841720125Falah {
    private String merk;
    private Processor1841720125Falah proc;

    public Laptop1841720125Falah(String merk, Processor1841720125Falah proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public Processor1841720125Falah getProc() {
        return proc;
    }

    public void setProc(Processor1841720125Falah proc) {
        this.proc = proc;
    }

    public Laptop1841720125Falah() {
    }
    
    public void info(){
        System.out.println("Merk Laptop = "+merk);
        proc.info();
    }
}
