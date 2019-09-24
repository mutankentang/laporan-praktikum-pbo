package pbojsempat;
public class Percobaan41841720125Falah {
    public static void main(String[] args) {
        Penumpang1841720125Falah p = new Penumpang1841720125Falah("1234", "Mr.Krab");

        Penumpang1841720125Falah budi = new Penumpang1841720125Falah("1234", "Budi");

        Gerbong1841720125Falah gerbong = new Gerbong1841720125Falah("A", 10);
        gerbong.setPenumpangFalah(p,1);

        gerbong.setPenumpangFalah(budi,1);

        System.out.println(gerbong.infoFalah());

    }
    
}
