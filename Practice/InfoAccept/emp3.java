//USING SETTERS AND GETTERS
import java.util.Scanner;
class employee{
    private int id;
    private String name;
    private String dept;
    private float salary;

    public void setID(int id){
        this.id = id;
     }
     public void setNAME(String name){
        this.name=name;
     }
     public void setDEPTARTMENT(String dept){
         this.dept=dept;
     }
     public void setSALARY(float salary){
        this.salary=salary;
     }
     public int getID(){
        return id;
     }
     public String getNAME(){
        return name;
     }
     
     public String getDEPARTMENT(){
        return dept;
     }
     public float getSALARY(){
        return salary;
     }

}
class Testemployee{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n,i,id;
        String name,dept;
        float salary;

        System.out.print("Enter How many employees :");
        n = sc.nextInt();
        employee emp[] = new employee[n];
         for(i=0;i<n;i++){
            System.out.print("Enter ID :");
            id=sc.nextInt();

            System.out.print("Enter NAME :");
            name=sc.next();

            System.out.print("Enter DEPARTMENT  :");
            dept=sc.next();

            System.out.print("Enter SALARY :");
            salary=sc.nextFloat();

            emp[i] = new employee();
            emp[i].setID(id);
            emp[i].setNAME(name);
            emp[i].setDEPTARTMENT(dept);
            emp[i].setSALARY(salary);
         }
          
        System.out.println("\nAll Employees info are as Followed ");
        System.out.println("ID \t\t NAME \t\t DEPT \t\t SALARY");
        for(employee e: emp){
           System.out.println( e.getID()+"\t\t"+e.getNAME()+"\t\t"+ e.getDEPARTMENT()+"\t\t"+ e.getSALARY());
        }
    }

}