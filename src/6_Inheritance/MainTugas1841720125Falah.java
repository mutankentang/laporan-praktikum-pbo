package pbojsenam;
public class MainTugas1841720125Falah {
    public static void main(String[] args) {
        Pc1841720125Falah pese = new Pc1841720125Falah();
        pese.merk = "ASUS";
        pese.kecProsesor = 350;
        pese.sizeMemory = 500;
        pese.jnsProsesor = "AMD";
        pese.ukuranMonitor = 40;
        pese.tampilDataFalah();
        System.out.println();
        
        Windows1841720125Falah wndws = new Windows1841720125Falah();
        wndws.merk = "Windows 10.9";
        wndws.kecProsesor = 500;
        wndws.sizeMemory = 800;
        wndws.jnsProsesor = "AMD";
        wndws.jnsBatrei = "Lepas";
        wndws.fitur = "Touchpad";
        wndws.tampilDataWindowsFalah();
        System.out.println();
        
        Mac1841720125Falah max = new Mac1841720125Falah();
        max.merk = "slim";
        max.kecProsesor = 300;
        max.sizeMemory = 500;
        max.jnsProsesor = "Intel";
        max.jnsBatrei = "Lepas";
        max.security = "face recognition";
        max.tampilDataMacFalah();
        
        
    }
}
