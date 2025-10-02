import java.util.*;

class LMV{
    private float mileage;

    public void accept(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Mileage :");
        mileage = s.nextFloat();
    }
    public void display(){
        System.out.println(mileage);
    } 
}
