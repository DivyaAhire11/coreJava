// main
import java.util.Scanner;

class Continent{
    private String continent;

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Continent : ");
        continent = sc.next();
    }
    public void display(){
        System.out.println(continent+"\t\t");
    }
}