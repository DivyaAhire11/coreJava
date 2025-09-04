
import java.util.Scanner;

class ASG2{
    private String name;
    private int id;
    private String dept;
    private float salary;
    private static int cnt;

    public ASG2(){ }
    public ASG2(int id,String name,String dept,float salary){
        this.id = id;
        this.name= name;
        this.dept = dept;
        this.salary = salary;
        cnt++;
        System.out.println("Object "+cnt+" created");
    }
    public String toString(){
        return "Employee Id = "+id+"\n Employee Name = "+name+"\n Department ="+dept+"\n Salary ="+salary;
    }
}
class TestASG{
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       
       int id,n,i;
       String name,dept;
       float salary;
        System.out.print("Enter Who many Employee :");
        n = s.nextInt();
        ASG2 a[] = new ASG2[n];
        for(i= 0;i<a.length;i++){
          
            System.out.print("Enter ID :");
            id=s.nextInt();

            System.out.print("Enter NAME :");
            name=s.next();

            System.out.print("Enter DEPARTMENT  :");
            dept=s.next();

            System.out.print("Enter SALARY :");
            salary=s.nextFloat();

             a[i] = new ASG2();
             a[i] = new ASG2(id,name,dept,salary);
        }
        System.out.println("\n\nEmployee's Detail are as follow");
       
         for(i= 0;i<a.length;i++){
           System.out.println(a[i]); //object print call toString
         }
    }
}