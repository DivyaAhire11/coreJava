package utility;
import java.util.*;

class CapitalString{
    private String name;
    
    public void accept(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Full Name : ");
        name = s.nextLine();  
    }
    public String[] Capitalized(){
        String[] b = name.split(" "); 
        String x[] = new String[b.length];
        for(int i=0 ;i<b.length;i++){
             x[i] = b[i].substring(0,1).toUpperCase() + b[i].substring(1).toLowerCase();
        }
           return x;     
    }

    public static void main(String args[]){
        CapitalString cs = new CapitalString();
        cs.accept();
        String x[] = new String[10];
        x = cs.Capitalized();
        System.out.print("Capitalized Name : ");
        for(String t : x){
            System.out.print(t+" ");
        }
    }
    public void display(){
       System.out.println(name);
    }
}