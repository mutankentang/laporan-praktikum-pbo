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
public class InternshipEmployee1841720125Falah extends Employee1841720125Falah{
    private int length;

    public InternshipEmployee1841720125Falah(String name,int length) {
        this.length = length;
        this.name = name;
    }

    public int getLengthFalah() {
        return length;
    }

    public void setLengthFalah(int length) {
        this.length = length;
    }
    
    @Override
    public String getEmployeeInfoFalah(){
        String info=super.getEmployeeInfoFalah()+"\n";
        info += "Registerd as internship employee for "+length+" month/s\n";
        return info;
    }
}
