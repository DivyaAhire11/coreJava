package msg;

import java.io.*;
import sy.*;
import ty.*;

public class Student{
    private int roll;
    private String name;
    private SYMark s;
    private TYMark t;
    private int total;
      
  
    public void accept(){
       BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
       try{
         System.out.println("Enter Roll Number:");
         roll = Integer.parseInt(b.readLine());

        System.out.println("Enter Name :");
        name = b.readLine();

        s = new SYMark();
        s.accept();

        t = new TYMark();
        t.accept();

        total = s.getSytotal() + t.getTytotal();

       }catch(Exception e){}
    }
    public void display(){
        System.out.println("Roll Number :"+roll);
        System.out.println("Name :"+name);
        s.display();
        t.display();
        System.out.print("Total is :"+total);
      
         
    }
}