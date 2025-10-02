import java.util.Scanner;
class HMV extends Vehicle{
    private float capacity;

    public void accept(){
       super.accept();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Capacity-in-tons : ");
       capacity = sc.nextFloat();
    }

    public void display(){
        super.display();
        System.out.println(capacity);
    }
}