package Package;
import java.util.Scanner;
import SY.*;
import TY.*;

public class Stud{
    int roll;
    String name;
    SYMarks o1;
    TYMarks o2;

    Stud(int roll,String name){
        this.roll = roll;
        this.name = name;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Computer Total marks :");
        int c = sc.nextInt();
        System.out.print("Enter Mathematics total Marks");
        int m = sc.nextInt();
        System.out.print("Enter Electronic total Marks");
        int e = sc.nextInt();
        
        o1 = new SYMarks(c,m,e);

        System.out.print("Enter Theory Marks :");
        int t = sc.nextInt();
        System.out.print("Enter Practical Marks :");
        int p = sc.nextInt();

        o2 = new TYMarks(t,p);
    }

    void grade(){

        int gt = o1.sytotal()+o2.tytotal();
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
    System.out.print("Enter How Many students : ");
    int n = s.nextInt();

    Stud a[] = new Stud[n];
    for(int i=0;i<n;i++){
       System.out.print("Enter ROLL NO : ");
       int r = s.nextInt();
       System.out.print("Enter NAME : ");
       String nm = s.next();

       a[i] = new Stud(r,nm);
    }
    System.out.println("\n Details Are ==> \n");
    for(int i=0;i<n;i++){
        a[i].o1.display();
        a[i].o2.display();
        a[i].grade();
    }

   }
   
}      