//USING CONSTRUCTOR INITIALIZED EMP INFO
import java.util.Scanner;
class emp{
    private int id;
    private String name;
    private String dept;
    private float salary;

    public emp(int i,String n,String d,float s){
        id = i;
        name = n;
        dept = d;
        salary = s;
    }
     public void display(){
        System.out.println(id+"\t\t"+name+"\t\t"+dept+"\t\t"+salary);
    }
}
class Testemp{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n,i,id;
        String name,dept;
        float salary;

         System.out.print("Enter How many employees :");
        n = sc.nextInt();
        emp e[] = new emp[n];
         for(i=0;i<n;i++)
           {
            System.out.print("Enter ID :");
            id=sc.nextInt();

            System.out.print("Enter NAME :");
            name=sc.next();

            System.out.print("Enter DEPARTMENT  :");
            dept=sc.next();

            System.out.print("Enter SALARY :");
            salary=sc.nextFloat();

             e[i]= new emp(id,name,dept,salary);
           }
        
         System.out.println("\nAll Employees info are as Followed ");
        System.out.println("ID \t\t NAME \t\t DEPT \t\t SALARY");
        for(emp t : e)
          t.display();
    }
}