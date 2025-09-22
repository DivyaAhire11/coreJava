import java.util.Scanner;

class ManagerInfo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,id,n;
        String name,dept;
        float sal;
        System.out.print("Enter How Many managers : ");
        n = sc.nextInt();

        Manager[] mr = new Manager[n];

        for(i = 0;i < mr.length; i++){
            System.out.print("Enter Id :");
            id = sc.nextInt();
            System.out.print("Enter Name :");
            name = sc.next();
            System.out.print("Enter Department :");
            dept = sc.next();
            System.out.print("Enter Salary :");
            sal = sc.nextFloat();
            mr[i] = new Manager(id,name,dept,sal);
            mr[i].accept();
           
        }
        
         System.out.println("ID\t\tNAME\t\tDAPARTMENT\tSALARY\t\tBONUS");
         for(i = 0;i < mr.length; i++){
            mr[i].display();
         }
    }
}