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
    private String grade;
  
    public void accept(){
       BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
       try{
         System.out.print("Enter Roll Number:");
         roll = Integer.parseInt(b.readLine());

        System.out.print("Enter Name :");
        name = b.readLine();

        s = new SYMark();
        s.accept();

        t = new TYMark();
        t.accept();

        total = s.getSytotal() + t.getTytotal();

       }catch(Exception e){}
    }
       public String Grade(){
        int tt = total/5;
        if(tt >= 80)
           grade = "A";
        else if(tt >=65 && tt <80)
           grade = "B";
        else if(tt >= 50 && tt <65)
           grade = "C";
        else if(tt >= 35 && tt < 50)
           grade = "D";
        else
           grade ="F";

       return grade;
           
    }
    public void display(){
        System.out.print(roll+"\t"+name);
        s.display();
        t.display();
        grade = Grade();
        System.out.println("\t"+total+"\t"+grade); 
    }
 
}