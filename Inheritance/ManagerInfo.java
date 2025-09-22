import java.util.Scanner;

class ManagerInfo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int id;
        String name,dept;
        float sal;
        System.out.print("Enter Id :");
        id = sc.nextInt();
         System.out.print("Enter Name :");
        name = sc.next();
         System.out.print("Enter Department :");
         dept = sc.next();
         System.out.print("Enter Salary :");
        sal = sc.nextFloat();
        Manager m = new Manager(id,name,dept,sal);
        m.accept();
       System.out.println("ID\t\tNAME\t\tDAPARTMENT\tSALARY\t\tBONUS");
        m.display();
    }
}