package sy;

import java.util.Scanner;

public class SYMark{
     private int comp;
     private int maths;
     private int elec;
     private int sytotal;

     public void accept(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Computer marks :");
        comp = sc.nextInt();

        System.out.println("Enter Maths marks :");
        maths = sc.nextInt();

        System.out.println("Enter Electronic marks :");
        elec = sc.nextInt();

        sytotal = comp + maths + elec;
     }
     public void display(){
        // System.out.print("\t"+comp +"\t"+ maths +"\t"+ elec);
         System.out.println("Computer marks :"+comp);
         System.out.println("Maths marks :"+maths);
         System.out.println("Electronic marks :"+elec); 
     }
     public int getSytotal(){
        return sytotal;
     }
     
}