//accept info using methods
import java.util.Scanner;
class emp{
    private int id;
    private String name;
    private String dept;
    private float salary;

    public void accept(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ID :");
        id=s.nextInt();

        System.out.print("Enter NAME :");
        name=s.next();

        System.out.print("Enter DEPARTMENT  :");
        dept=s.next();

        System.out.print("Enter SALARY :");
        salary=s.nextFloat();
    }
     public void display(){
        System.out.println(id+"\t\t"+name+"\t\t"+dept+"\t\t"+salary);
    }
}
class Testemp{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n,i;
         System.out.print("Enter How many employees :");
        n = sc.nextInt();
        emp e[] = new emp[n];
       
        for(i=0;i<n;i++){
            e[i]=new emp();
            e[i].accept();
        }

        System.out.println("\nAll Employees info are as Followed ");
        System.out.println("ID \t\t NAME \t\t DEPT \t\t SALARY");
        for(emp x:e)
          x.display();
    }
}