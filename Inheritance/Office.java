import java.util.*;

class Office{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n,id,i;
       String nm,dpt;
       System.out.print("Enter How many Members Of staff : ");
       n = sc.nextInt();

       OfficeStaff os[] = new OfficeStaff[n];
       for(i=0;i<os.length;i++){
          System.out.print("Enter ID : ");
          id = sc.nextInt();
          System.out.print("Enter Name : ");
          nm = sc.next();
          System.out.print("Enter DEPT : ");
          dpt = sc.next();
         os[i] = new OfficeStaff(id,nm,dpt);
       }
       System.out.println("ID\tNAME\tDEPARTMENT");
       for(i=0;i<os.length;i++){
          os[i].display();
       }
    }
}