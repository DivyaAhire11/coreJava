import java.io.IOException;
import java.util.Scanner;

class Continent{
    String con;
    Scanner sc = new Scanner(System.in);
    void getContinent(){
        System.out.print("Enter Continent : ");
        con = sc.next();
    }
}

class Country extends Continent{
    String cntry;
    void getCountry(){
        System.out.print("Enter Country : ");
        cntry = sc.next();
    }
}
class State extends Country{
    String st;
    void getState(){
        System.out.print("Enter State : ");
        st = sc.next();
    }
}
class Inheritance{
    public static void main(String []args)throws IOException{
         State s = new State();
         s.getContinent();
         s.getCountry();
         s.getState();

         System.out.println("\n State '"+s.st+"' belongs from country '"+s.cntry+"' of '"+s.con+"'Continent \n" );
    }
}