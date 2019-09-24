package pbojsempat;
public class MainPercobaan21841720125Falah {
    public static void main(String[] args) {
        Mobil1841720125Falah m=new Mobil1841720125Falah();
        m.setNama("Avanza");
        m.setBiaya(350000);
        
        Sopir1841720125Falah s =new Sopir1841720125Falah();
        s.setNama("John Doe");
        s.setBiaya(200000);
        
        Pelanggan1841720125Falah p= new Pelanggan1841720125Falah();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya Total = "+p.hitungBiayaTotalFalah());
                
    }
    
}
