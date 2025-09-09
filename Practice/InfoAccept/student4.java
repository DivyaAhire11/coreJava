import java.util.Scanner;

class Student{
    private int roll;
    private String name;
    private float total_marks;
    private int num_subjects;
    private float avg;

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
    }
    public void display(){
          System.out.println(roll +"\t\t"+ name +"\t\t"+ avg);
    }

    public String toString(){
        return " "+this.roll+"\t\t"+this.name+"\t\t"+this.avg;
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
        sc.close();
   }
}