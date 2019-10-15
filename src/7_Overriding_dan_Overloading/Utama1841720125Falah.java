package pbojstujuh;
public class Utama1841720125Falah {
    public static void main(String[] args) {
          System.out.println("Program Testing Class Manager & Staff");
        Manager1841720125Falah mg[] = new Manager1841720125Falah[2];
        Staff1841720125Falah stf1[] = new Staff1841720125Falah[2];
        Staff1841720125Falah stf2[] = new Staff1841720125Falah[3];
        
        System.out.println();
        mg[0] = new Manager1841720125Falah();
        mg[0].setmNamaFalah("Tedjo");
        mg[0].setmNipFalah("101");
        mg[0].setmGolonganFalah("1");
        mg[0].setmTunjanganFalah(5000000);
        mg[0].setmBagianFalah("Administrasi");
        
        System.out.println();
        mg[1] = new Manager1841720125Falah();
        mg[1].setmNamaFalah("Atika");
        mg[1].setmNipFalah("102");
        mg[1].setmGolonganFalah("1");
        mg[1].setmTunjanganFalah(2500000);
        mg[1].setmBagianFalah("Pemasran");
        
        System.out.println();
        stf1[0] = new Staff1841720125Falah();
        stf1[0].setmNamaFalah("Usman");
        stf1[0].setmNipFalah("0003");
        stf1[0].setmGolonganFalah("2");
        stf1[0].setmLemburFalah(10);
        stf1[0].setmGajiLemburFalah(10000);
        
        System.out.println();
        stf1[1] = new Staff1841720125Falah();
        stf1[1].setmNamaFalah("Anugrah");
        stf1[1].setmNipFalah("0005");
        stf1[1].setmGolonganFalah("2");
        stf1[1].setmLemburFalah(10);
        stf1[1].setmGajiLemburFalah(55000);
        mg[0].setStFalah(stf1);
        
        System.out.println();
        stf2[0] = new Staff1841720125Falah();
        stf2[0].setmNamaFalah("Hendra");
        stf2[0].setmNipFalah("0004");
        stf2[0].setmGolonganFalah("3");
        stf2[0].setmLemburFalah(15);
        stf2[0].setmGajiLemburFalah(5500);
        
        System.out.println();
        stf2[1] = new Staff1841720125Falah();
        stf2[1].setmNamaFalah("Arie");
        stf2[1].setmNipFalah("0006");
        stf2[1].setmGolonganFalah("4");
        stf2[1].setmLemburFalah(5);
        stf2[1].setmGajiLemburFalah(100000);
        
        System.out.println();
        stf2[2] = new Staff1841720125Falah();
        stf2[2].setmNamaFalah("Mentari");
        stf2[2].setmNipFalah("0007");
        stf2[2].setmGolonganFalah("3");
        stf2[2].setmLemburFalah(6);
        stf2[2].setmGajiLemburFalah(20000);
        mg[1].setStFalah(stf2);
        
        System.out.println();
        mg[0].lihatInfoFalah();
        mg[1].lihatInfoFalah();

    }
    }
    

