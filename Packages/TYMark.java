package ty;

import java.io.*;

public class TYMark{
     private int theory;
     private int practical;
     private int tytotal;

     public void accept(){
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
       try{
            System.out.print("Enter Theory marks :");
            theory = Integer.parseInt(b.readLine());

            System.out.print("Enter Practical marks :");
            practical = Integer.parseInt(b.readLine());

            tytotal = theory  + practical;
        }catch(Exception e){}
     }
     public void display(){
        System.out.print("\t"+theory+"\t"+ practical +"\t");         
     }
     public int getTytotal(){
        return tytotal;
     }
}