package pbojssatu;
public class SepedaGunung1841720125Falah extends Sepeda1841720125Falah {
private String tipeSuspensi;
    
    public void setTipeSuspensi(String newValue)
    {
        tipeSuspensi = newValue;
    }
    public void cetakStatus()
    {
        super.cetakStatus();
        System.out.println("Tipe suspensi: "+ tipeSuspensi);
    }
}

