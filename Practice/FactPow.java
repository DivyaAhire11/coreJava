import java.util.Scanner;

class FactPow{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Utility a = new Utility();
        int n,x,y,ans;
        System.out.print("Enter Number For Calculating Factorial : ");
         n = sc.nextInt();
        ans = a.factorial(n);
        System.out.println("Factorial of "+n+" is : "+ans);

        System.out.print("Enter number and its Power:");
        x = sc.nextInt();
        y = sc.nextInt();
        ans = a.power(x,y);
        System.out.println(x +" raise to "+y+" is :"+ans);
    }
}