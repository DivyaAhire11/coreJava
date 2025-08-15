import java.util.Scanner;

class option{
       public boolean isEven(int n){
           return  n%2 == 0;
       }
      public boolean isOdd(int n){
        return n%2 != 0;
      }
      public boolean isPositive(int n){
        return n>0;
      }
      public boolean isNegative(int n){
        return n<0;
      }
      public boolean isZero(int n){
        return n == 0;
      }
    public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number x :");
       int x = sc.nextInt();

       option ob = new option();
    
         if( ob.isEven(x))
            System.out.println(x+" is Even ");

         if(ob.isOdd(x))
             System.out.println(x+" is Odd ");

        if(ob.isNegative(x))
            System.out.println(x+ " : Negative number");

        if(ob.isPositive(x))
           System.out.println(x+ " is Positive number");
      
        if(ob.isZero(x))
           System.out.println(x+ " is Zero number");
     
    }
}