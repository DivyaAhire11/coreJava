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
        String[] b = name.split(" ", 0); 
        System.out.println(b[0]+"\n"+b[1]+"\n"+b[2]);
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