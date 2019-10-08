package pbojsenam;
public class Laptop1841720125Falah extends Komputer1841720125Falah{
    public String jnsBatrei;

    public Laptop1841720125Falah() {
    }

    public Laptop1841720125Falah(String jnsBatrei, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBatrei = jnsBatrei;
    }
    
    public void tampilDataLaptopFalah(){
        super.tampilDataFalah();
        System.out.println("Jenis Baterai : "+jnsBatrei);
    }
}
