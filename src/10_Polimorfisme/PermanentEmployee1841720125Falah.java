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
public class PermanentEmployee1841720125Falah extends Employee1841720125Falah
        implements Payable1841720125Falah{
    private int salary;
    
    public PermanentEmployee1841720125Falah(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public int getSalaryFalah() {
        return salary;
    }

    public void setSalaryFalah(int salary) {
        this.salary = salary;
    }
    
    @Override
    public int getPaymentAmountFalah(){
        return(int)(salary+0.05+salary);
    }
    
    @Override
    public String getEmployeeInfoFalah(){
        String info=super.getEmployeeInfoFalah()+"\n";
        info += "Registered as permanent employee with salary "+salary+"\n";
        return  info;
    }
}
