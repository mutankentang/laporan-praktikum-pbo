package pbojsempat;
public class MainPercobaan11841720125Falah {
    public static void main(String[] args) {
        Processor1841720125Falah p = new Processor1841720125Falah("Intel i5", 3);
        Laptop1841720125Falah l = new Laptop1841720125Falah("Thinkpad",p);
        
        l.info();
        Processor1841720125Falah p1=new Processor1841720125Falah();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop1841720125Falah L1=new Laptop1841720125Falah();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.info();
                
        
    }    
}
