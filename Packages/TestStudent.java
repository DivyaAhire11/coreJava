package test;
import msg.*;
import java.util.Scanner;

class Test{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many num of Student :");
        int n = sc.nextInt();

        Student st[] =new Student[n];
        for(int i=0;i<n;i++){
            st[i] = new Student();
            st[i].accept();
        }
        System.out.println("\n ------Student Details-----");
        System.out.println("Roll\tName\tComp\tMath\tElect\tTheory\tPractical\tTotal\tGrade");
          for(int i=0;i<n;i++){
            st[i].display();
        }
    }
}