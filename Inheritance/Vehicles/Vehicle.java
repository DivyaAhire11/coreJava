import java.util.*;

class Vehicle{
    private String company;
    private float price;

    public Vehicle(String company,float price){
        this.company = company;
        this.price = price;
    }

    public void accept(){
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter Company Name : ");
           company = sc.next();
           System.out.print("Enter Price : ");
           price = sc.nextFloat();
    }
    public void display(){
        System.out.print(company+"\t\t"+price+"\t\t");
    }
}