import java.util.*;

class MyArithmeticException extends Exception{
   //if I never Written toString() then it goes to its superclass toString 
   //superclass is Exception 
   //Exception : toString return : name of subclass
   // output ==>
   // Enter First Number : 6
   // Enter Second Number : 0
   // MyArithmeticException
   // EXIT OF MAIN METHOD
}

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter First Number : ");
        a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        b = sc.nextInt();
        try{
          if(b == 0){
             throw new MyArithmeticException();
          }else{
             c = a/b;
             System.out.println("Result is : "+c);  
          }
        }catch(MyArithmeticException ae){
            System.out.println(ae); // ae.toString()
        }
        System.out.println("EXIT OF MAIN METHOD");
    }
}