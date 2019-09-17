package pbojstiga;
public class Motor1841720125Falah {
    private int kecepatan= 90;
    private boolean kontakOn= false;
    public void nyalakanMesinFalah(){
        kontakOn=true;
    }
    public void matikanMesinFalah(){
        kontakOn=false;
        kecepatan=0;
    }
    public void tambahKecepatanFalah(){
        if(kontakOn==true){
            if (kecepatan>=100) {
                kecepatan=100;
            }else{
                kecepatan+=5;
            }
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    public void kurangiKecepatanFalah(){
        if(kontakOn==true){
            kecepatan -=5;
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    public void printStatusFalah(){
        if(kontakOn==true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+kecepatan+"\n");
    }
}
