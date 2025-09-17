package tybbaca;

import java.util.Scanner;

public class StudentDetail{
    private int Rno;
    private String SName;
    private float Per;

    public void accept(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter ROLL NO :");
       Rno = sc.nextInt();
       System.out.print("Enter NAME :");
       SName = sc.next();
       System.out.print("Enter PERCENTAGE :");
       Per = sc.nextFloat();
    }
   
    public void disp(){
        System.out.println(Rno+"\t\t"+SName+"\t\t"+Per);
    }
}