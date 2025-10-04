// Country inherite continent
import java.util.Scanner;

class Country extends Continent{
    private String country;
      
    public Country(String ctnt,String ctry){
        super(ctnt);
        this.country = ctry;
    }

    public void accept(){
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Country : ");
        country = sc.next();
    }
    public void display(){
        super.display();
        System.out.print(country+"\t\t");
    }
}