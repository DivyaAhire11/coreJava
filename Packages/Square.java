//One File And Two Class
import java.util.Scanner;

class Square{
       int n;

       public Square(int x){
         n = x;
       }      

       public void printSquare(){
         for(int i = 1;i <= n; i++){
            System.out.print((i*i)+"\t");
         }
       }  
}
class TestSquare{
 public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number :");
       int x = sc.nextInt();

       Square ob = new Square(x);
       System.out.println("Square Serirs ");
       ob.printSquare();
 }
}