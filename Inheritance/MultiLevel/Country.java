// Country inherite continent
import java.util.Scanner;

class Country extends Continent{
    private String Country;

    public void accept(){
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Country : ");
        Country = sc.next();
    }
    public void display(){
        System.out.print(Country+"\t\t");
        super.display();
    }
}