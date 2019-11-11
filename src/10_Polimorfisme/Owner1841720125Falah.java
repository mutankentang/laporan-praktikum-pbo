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
public class Owner1841720125Falah {
    public void payFalah(Payable1841720125Falah p) {
        System.out.println("Total payment = "+p.getPaymentAmountFalah());
        if(p instanceof ElectricityBill1841720125Falah){
            ElectricityBill1841720125Falah eb = (ElectricityBill1841720125Falah)p;
            System.out.println(""+eb.getBillInfoFalah());
        }else if(p instanceof PermanentEmployee1841720125Falah){
            PermanentEmployee1841720125Falah pe = (PermanentEmployee1841720125Falah) p;
            pe.getEmployeeInfoFalah();
            System.out.println(""+pe.getEmployeeInfoFalah());
        }
    }
    
    public void showMyEmployeeFalah(Employee1841720125Falah e){
        System.out.println(""+e.getEmployeeInfoFalah());
        if (e instanceof PermanentEmployee1841720125Falah) 
            System.out.println("You Have to pay her/him monthly!!!");
        else 
            System.out.println("No need to pay him/her :)");
    }
}
