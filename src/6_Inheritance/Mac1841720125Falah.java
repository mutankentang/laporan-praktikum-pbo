package pbojsenam;
public class Mac1841720125Falah extends Laptop1841720125Falah{
    public String security;

    public Mac1841720125Falah() {
    }

    public Mac1841720125Falah(String security, String jnsBatrei, String merk, String jnsProsesor, 
            int kecProsesor, int sizeMemory) {
        super(jnsBatrei, merk, jnsProsesor, kecProsesor, sizeMemory);
        this.security = security;
    }
    
    public void tampilDataMacFalah(){
        super.tampilDataLaptopFalah();
        System.out.println("Security : "+security);
    }
}
