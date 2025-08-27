import java.util.*;
//use: Random and Scanner

class Input{
    public static void main(String args[]){
       Random r = new Random();
       Scanner sc = new Scanner(System.in);
       int n1,n2,n3,n4,ans,result;
       n1 = r.nextInt(10);
       n2 = r.nextInt(10);
       System.out.println("first number is :"+n1);
       System.out.println("Second number is :"+n2);

       System.out.print("Enter third number :");
       n3 = sc.nextInt();
       System.out.print("Enter fourth number :");
       n4 = sc.nextInt();

       ans = Utility.power(n1,n2);
       System.out.println(n1 +" raise to "+ n2+" is : "+ans);

       ans = Utility.power(n3,n4);
       System.out.println(n3 +" raise to "+ n4+" is : "+ans);

       result = Utility.factorial(n1);
       System.out.println("Factorial of "+n1+" is :"+result);

       result = Utility.factorial(n2);
       System.out.println("Factorial of "+n2+" is :"+result);

       result = Utility.factorial(n3);
       System.out.println("Factorial of "+n3+" is :"+result);

       result = Utility.factorial(n4);
       System.out.println("Factorial of "+n4+" is :"+result);
    }
}