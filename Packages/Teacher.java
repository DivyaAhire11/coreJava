package tybbaca;
import java.util.*;

public class Teacher{
    private int TID;
    private String TName;
    private String Subject;

    public void accept(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter TEACHER ID :");
       TID = sc.nextInt();
       System.out.print("Enter TEACHER NAME :");
       TName = sc.next();
       System.out.print("Enter SUBJECT :");
       Subject = sc.next();
    }
    public String getSubject(){
        return Subject;
    }
    public void disp(){
        System.out.println(TID+"\t\t"+TName+"\t\t"+Subject);
    }
    // @Override
    // protected void finalize() throws Throwable{
    //     System.out.println("Finalizing Teacher Object :"+TName);
    //     super.finalize();
    // }
}