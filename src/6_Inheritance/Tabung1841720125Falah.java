package pbojsenam;
public class Tabung1841720125Falah extends Bangun1841720125Falah{
        protected int t;
    
    public void setSuperPhiFalah(double phi){
        super.phi = phi;
    }
    
    public void setSuperRFalah(int r){
        super.r = r;
    }
    
    public void setTFalah(int t){
        this.t = t;
    }
    
    public void volumeFalah(){
        System.out.println("Volume tabung adalah : "+(super.phi * super.r * super.r 
                * this.t));
    }
}
