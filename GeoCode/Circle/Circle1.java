//Area of Circle PI*r*r
//Without OOPs
import java.util.Scanner;

class Circle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float r,A;
        System.out.print("Enter radius :");
        r = sc.nextFloat();

        A = 3.14f * r * r;
         System.out.println("Area Of Circle : "+A);
    }
}