package utility;
import java.util.*;

class CapitalString{
    private String name;
    
    public void accept(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Full Name : ");
        name = s.nextLine();  
    }
    public void Capitalized(){
        String[] b = name.split(" "); 
        for(String cs : b){
            String x = cs.substring(0,1).toUpperCase()+cs.substring(1).toLowerCase();
              System.out.print(x+" ");
        }
              
    }

    public static void main(String args[]){
        CapitalString cs = new CapitalString();
        cs.accept();
        cs.Capitalized();
    }
    public void display(){
       System.out.println(name);
    }
}