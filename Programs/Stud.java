package pkg;

import java.util.Scanner;
import sy.*;
import ty.*;

public class Stud{
    int roll;
    String name;
    SYMarks ob1; //reference of sy
    TYMarks ob2; //reference of ty

    Stud(int roll,String name){
        this.roll = roll;
        this.name = name;
          
        int compMks,mathMks,eleMks,theoryMks,practMks;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Computer Total marks :");
        compMks = sc.nextInt();
        System.out.print("Enter Mathematics total Marks");
        mathMks = sc.nextInt();
        System.out.print("Enter Electronic total Marks");
        eleMks = sc.nextInt();
        
        ob1 = new SYMarks(compMks,mathMks,eleMks); //object and(parameterized constructor call)

        System.out.print("Enter Theory Marks :");
        theoryMks = sc.nextInt();
        System.out.print("Enter Practical Marks :");
        practMks = sc.nextInt();

        ob2 = new TYMarks(theoryMks,practMks); //object and(parameterized constructor call)
    }

    void grade(){

        int gt = ob1.sytotal()+ob2.tytotal();
        double per = gt/5;
         if(per >= 75)
            System.out.println("Distinction!!!");
         else if(per >= 60 && per<75)
             System.out.println("First Class");
         else if( per >= 50 && per<60)
             System.out.println("Second Class");
         else
             System.out.println("Fail!!, STUDY HARD");
    }          
   
   public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n,roll;
    String nm;

    System.out.print("Enter How Many students : ");
    n = s.nextInt();

    Stud a[] = new Stud[n];
    for(int i=0;i<n;i++){
       System.out.print("Enter ROLL NO : ");
       roll = s.nextInt();
       System.out.print("Enter NAME : ");
       nm = s.next();

       a[i] = new Stud(roll,nm);
    }
    System.out.println("\n Details Are ==> \n");
    for(int i=0;i<n;i++){
      System.out.println("Computer Marks   Mathematic Marks  Electronic Marks ");
        a[i].ob1.display();
      System.out.println("Theory marks   Practical marks");
       a[i].ob2.display();
       System.out.println("\n");
        a[i].grade();
      System.out.println("\n");

    }
   }
   
} 
