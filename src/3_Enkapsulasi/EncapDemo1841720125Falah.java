package pbojstiga;
public class EncapDemo1841720125Falah {
    private String name;
    private int age;
    
    public String getNameFalah(){
        return name;
    }
    
    public void setNameFalah(String newName){
        name=newName;
    }
    
    public int getAgeFalah(){
        return age;
    }
    
    public void setAgeFalah(int newAge){
        if(newAge > 30)
        {
            age=30;
        }if(newAge < 18){
            age=18;
        }else{
            age=newAge;
        }
    }
}