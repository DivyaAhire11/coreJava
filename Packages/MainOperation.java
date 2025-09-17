import operation.Addition;
import operation.Maximum;
import java.util.*;

class Test{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int a,b,ans;
        float c,d,res;
        System.out.print("Enter Two Integer Numbers :");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.print("\nEnter Two Float Numbers :");
        c = sc.nextFloat();
        d = sc.nextFloat();

        Addition Ad = new Addition(a,b,c,d);
        ans = Ad.add();
        res = Ad.subtract();
        System.out.println("\nAddition Of "+a+" and "+b+" = "+ans);
        System.out.println("Subtraction Of "+c+" and "+d+" = "+res);
   
        Maximum mx = new Maximum(a,b);
        ans = mx.max();
        System.out.println("Maximum of "+a+" and "+b+" = "+ans);
    }
}