package pbojssatu;
public class ParfumRuangan1841720125Falah extends Parfum1841720125Falah {
    private String jenisParfum;
    
    public void jenisParfum(String newValue){
        jenisParfum=newValue;
    }
    
    public void cetak(){
        super.cetak();
        System.out.println("Jenis Parfum: "+ jenisParfum);
    }
}
