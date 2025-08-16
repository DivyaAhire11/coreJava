//using method accept and display
import java.util.Scanner;

class Info{
    private int roll;
    private String name;
    private float marks;
    
    public void accept(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter roll :");
       roll = sc.nextInt();

       System.out.print("Enter name :");
       name= sc.next();

       System.out.print("Enter marks :");
       marks = sc.nextFloat();
    }
    public void display(){
        System.out.println(roll+"\t\t"+name+"\t\t"+marks+"%");
    }
}
class student1{
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
    //    Info st = new Info();//object create
    //    st.accept();
    //    Info st1 = new Info();
    //    st1.accept();   
       
    //    st.display();
    //    st1.display();

       int n,i;
       System.out.println("Enter How many student :");
       n=sc.nextInt();

       Info a[] = new Info[n]; //array of reference
       for(i=0;i<a.length;i++){
           a[i] = new Info(); //object create
           a[i].accept();
       }

       System.out.println("All Student info are as Followed ");
       System.out.println("ROLLNO \t\t NAME \t\t MARKS");
       for(i=0;i<a.length;i++){
           a[i].display();
       }
   
     }
}