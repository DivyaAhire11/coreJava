import java.util.Scanner;
class HMV{
    private float capacity;

    public void accept(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Capacity-in-tons : ");
       capacity = sc.nextFloat();
    }

    public void display(){
        System.out.println(capacity);
    }
}