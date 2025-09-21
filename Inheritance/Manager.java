import java.util.Scanner;

class Manager extends Employee{
    private float bonus;

    public Manager(){}
   
    public void accept(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter bonas :");
    bonus = sc.nextFloat();
    }
    public void display(){
        super.display();
        System.out.println(this.bonus);
    }
}