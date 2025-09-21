import utility.CapitalString;
import java.util.Scanner;
class Capital{
      public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String name,city;
        System.out.print("Enter Your Full Name : ");
        name = s.nextLine();  
       
        System.out.print("Enter City Name : ");
        city = s.nextLine();
        
        String x[] = new String[5];
        CapitalString cs = new CapitalString();
        x = cs.Capitalized(name);
        Person p = new Person(name,city);
        p.display(x);
    }
}