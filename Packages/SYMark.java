package sy;

import java.util.Scanner;

public class SYMark{
     private int comp;
     private int maths;
     private int elec;
     private int sytotal;

     public void accept(){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter Computer marks :");
        comp = sc.nextInt();

        System.out.print("Enter Maths marks :");
        maths = sc.nextInt();

        System.out.print("Enter Electronic marks :");
        elec = sc.nextInt();

        sytotal = comp + maths + elec;
     }
     public void display(){
        System.out.print("\t"+comp +"\t"+ maths +"\t"+ elec);
     }
     public int getSytotal(){
        return sytotal;
     }
     
}