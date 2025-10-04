// main
import java.util.Scanner;

class Continent{
    private String continent;

   public Continent(String continent){
    this.continent = continent;
   }
    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Continent : ");
        continent = sc.next();
    }
    public void display(){
        System.out.print(continent+"\t\t");
    }
}