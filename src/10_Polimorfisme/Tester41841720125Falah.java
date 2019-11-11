/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbojssepuluh;

/**
 *
 * @author sepuluh
 */
public class Tester41841720125Falah {
    public static void main(String[] args) {
        Owner1841720125Falah ow =new Owner1841720125Falah();
        ElectricityBill1841720125Falah eBill = new ElectricityBill1841720125Falah(5, "R-1");
        ow.payFalah(eBill);
        System.out.println("-----------------------------");
        
        PermanentEmployee1841720125Falah pEmp =new PermanentEmployee1841720125Falah("Dedik", 500);
        ow.payFalah(pEmp);
        System.out.println("-----------------------------");
        
        InternshipEmployee1841720125Falah iEmp = new InternshipEmployee1841720125Falah("Sunarto", 5);
        ow.showMyEmployeeFalah(pEmp);
        System.out.println("---------------------------------------");
        ow.showMyEmployeeFalah(iEmp);
    }
}
