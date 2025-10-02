import java.util.*;

class LMV extends Vehicle{
    private float mileage;

    public void accept(){
        super.accept();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Mileage :");
        mileage = s.nextFloat();
    }
    public void display(){
        super.display();
        System.out.println(mileage);
    } 
}
