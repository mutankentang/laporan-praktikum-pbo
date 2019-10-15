package pbojstujuh;
class Ikan1841720125Falah {
    public void swimFalah(){
        System.out.println("Ikan Bisa Berenang");
    }
}
class PiranhaFalah extends Ikan1841720125Falah{
    public void swimFalah(){
        System.out.println("Piranha bisa makan daging");
    }
}

public class FishFalah {
    public static void main(String[] args) {
        Ikan1841720125Falah a= new Ikan1841720125Falah();
        Ikan1841720125Falah b= new PiranhaFalah();
        a.swimFalah();
        b.swimFalah();
    }
}