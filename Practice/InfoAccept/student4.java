// import java.util.Scanner;
// import java.util.Arrays;
import java.util.*;

class Student{
    private int roll;
    private String name;
    private float total_marks;
    private int num_subjects;
    private float avg;
    private static int count;

    public Student(){
        roll = 0;
        name = "unknown";
        total_marks = 0.0f;
        num_subjects = 1;
        avg = total_marks / num_subjects;  
    }

    public Student(int roll,String name,float total_marks,int num_subjects){
        this.roll = roll;
        this.name = name;
        this.total_marks = total_marks;
        this.num_subjects = num_subjects;
        this.avg = this.total_marks / this.num_subjects;
        count++;
    }

    public void accept(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ROLL NUMBER :");
        roll = sc.nextInt();
        System.out.print("Enter NAME :");
        name = sc.next();
        System.out.print("Enter TOTAL MARKS :");
        total_marks = sc.nextFloat();
        System.out.print("Enter NUMBER OF SUBJECTS :");
        num_subjects = sc.nextInt();
        
        this.avg = this.total_marks / this.num_subjects;
        count++;
    }
    public void display(){
          System.out.println(roll +"\t\t"+ name +"\t\t"+ avg+"%");
    }

    public String toString(){
        return " "+this.roll+"\t\t"+this.name+"\t\t"+this.avg+"%";
    }

    public static int searchStudent(Student st[],int x){
        int loc = -1,flag = 0;
        for(int i=0;i<st.length;i++){
            if(st[i].roll == x){
                loc = i;
                break;
            }
        }
        return loc;
    }

    public static int topper(Student st[]){
        int loc = 0;
        float max = st[0].avg;
       for(int i=0;i< st.length;i++){
            if(st[i].avg > max){
               max = st[i].avg;
               loc = i;
            }
        }
        return loc;
    }

    public static void totalStudent(Student st[]){
        System.out.println("Total Students Of Class is :"+count);
    }
 
    public static void sortStudent(Student st[]){
        Arrays.sort(st ,Comparator.comparing(s->s.name));
        for(Student s: st){
            System.out.println(s);
        }
    }
    
   public static void convert(Student st[]){
    for(Student t : st){
        if (t.name.length() > 0) 
            t.name = t.name.substring(0,1).toUpperCase() + t.name.substring(1).toLowerCase();
      }
   }

 }

class TestMyStudent{
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.print("Enter How Many Student :");
        n = sc.nextInt();
        Student st[] = new Student[n];
        for(i = 0;i<n;i++){
            st[i] = new Student();
            st[i].accept();
        }

        System.out.println("\nStudent Information are as Follow");
        for(Student t : st){
            // t.display();
            System.out.println(t);
        }
        
        int x;
        System.out.print("\nEnter Roll No To be Searched :");
        x = sc.nextInt();

        int l;
        l = Student.searchStudent(st,x);
        if(l == -1){
            System.out.println("\nStudent Having Roll Num "+x+" Not Found");
        }else{
            st[l].display();
        }

        System.out.print("\nHeyyy!\n 1. You Want To see Topper Of Class \n 2. Total Number of Students \n 3. Sort Students By its Name \n And Capitalized names (y/n) : ");
        String say = sc.next();

        if(say.equalsIgnoreCase("y")){
            int topperIdx = Student.topper(st);
            System.out.println("\n\n------ClASS TOPPER -----");
            st[topperIdx].display();

      
            System.out.println("\n\nTotal Student:");
            Student.totalStudent(st);

            Student.convert(st);

            System.out.println("\n\n Sort Student By its name ");
            Student.sortStudent(st);

        }else{
            sc.close();
        }
     
   }
}