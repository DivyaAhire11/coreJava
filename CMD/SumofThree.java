//using scanner and cmd inputs 

import java.util.*;

class SumofThree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,a=0,b=0,c=0;
        n = args.length;
       try{
        
        if(n<1){
        System.out.print("Enter First Input :");
        a = sc.nextInt();
        }else{
           a = Integer.parseInt(args[0]);
        }

        if(n<2){

          System.out.print("Enter second Input :");
          b = sc.nextInt();

        }else{
           b = Integer.parseInt(args[1]);
        }

        if(n<3){
          System.out.print("Enter third Input :");
          c = sc.nextInt();
        }else{
           c = Integer.parseInt(args[2]);
        }

        int ans = a+b+c;
        System.out.println("Sun of "+a+" + "+b+" + "+c+" is :"+ans);

       }catch(Exception e){
        System.out.println("Something happened,Enter Valid Input");
       }
    }
}