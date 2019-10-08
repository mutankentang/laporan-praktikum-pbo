package pbojsenam;
public class Windows1841720125Falah extends Laptop1841720125Falah{
     public String fitur;

    public Windows1841720125Falah() {
    }

    public Windows1841720125Falah(String fitur, String jnsBatrei, String merk, String jnsProsesor, 
            int kecProsesor, int sizeMemory) {
        super(jnsBatrei, merk, jnsProsesor, kecProsesor, sizeMemory);
        this.fitur = fitur;
    }
    
    public void tampilDataWindowsFalah(){
        super.tampilDataLaptopFalah();
        System.out.println("Fitur : "+fitur);
    }
}
