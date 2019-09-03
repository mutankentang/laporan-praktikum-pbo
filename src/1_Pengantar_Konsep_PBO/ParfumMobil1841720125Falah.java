package pbojssatu;
public class ParfumMobil1841720125Falah extends Parfum1841720125Falah{
    private String Tipe;
    
    public void Tipe(String newValue){
        Tipe=newValue;
    }
    
    public void cetak(){
        super.cetak();
        System.out.println("Tipe Parfum: "+ Tipe);
    }
}
