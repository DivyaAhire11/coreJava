
import tybbaca.StudentDetail;
import tybbaca.Teacher;

import java.util.Scanner;

class TeacherStudentDetail{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,n,nn;
        System.out.print("Enter How Many Students :");
        n = sc.nextInt();
        System.out.print("Enter How Many Teacher :");
        nn = sc.nextInt();
        
        StudentDetail st[] = new StudentDetail[n];
        Teacher tc[] = new Teacher[nn];

        for(i=0;i<st.length;i++){
            st[i] = new StudentDetail();
            st[i].accept();
        }
        System.out.println("\n-------------------");
        for(i=0;i<tc.length;i++){
            tc[i] = new Teacher();
            tc[i].accept();
        }
         System.out.println("\n---------STUDENT DETAILS----------");
        System.out.println("ROLLNO\t StudentNAME \t PERCENTAGE");
        for(StudentDetail s : st){
            s.disp();
        }
        System.out.println("\n---------TEACHERS DETAILS----------");
        System.out.println("TeacherID \t TeacherName \t Subject");
        for(Teacher t : tc){
            t.disp();
        }

        System.out.println("---------JAVA TEACHER----------");
        for(i=0;i<tc.length;i++){
        if(tc[i].getSubject().equalsIgnoreCase("Java")){
            System.out.println("TeacherID \t TeacherName \t Subject");
            tc[i].disp();
            break;
        }
        }
 }
}