
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
public class ElectricityBill1841720125Falah implements Payable1841720125Falah{
    private int kwh;
    private String category;

    public ElectricityBill1841720125Falah(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwhFalah() {
        return kwh;
    }

    public void setKwhFalah(int kwh) {
        this.kwh = kwh;
    }

    public String getCategoryFalah() {
        return category;
    }

    public void setCategoryFalah(String category) {
        this.category = category;
    }
    
    @Override
    public int getPaymentAmountFalah(){
    return kwh*getBasePriceFalah();
    }
    public int getBasePriceFalah(){
        int bPrice = 0;
        switch(category){
            case "R-1" : bPrice = 100;break;
            case "R-2" : bPrice = 200;break;
        }
        return bPrice;
    }
    public String getBillInfoFalah(){
        return "kWH = "+kwh+"\n"+
                "Category = "+category+"("+getBasePriceFalah()+" per kWH)\n";
    }
}