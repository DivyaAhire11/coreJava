import java.util.Scanner;

class Info2{
    private int roll;
    private String name;
    private float Marks;

    public Info2(int roll,String name,float Marks){
        this.roll=roll; //this refered current object
        this.name=name;
        this.Marks=Marks;
    }
    public void display(){
        System.out.println(roll +"\t\t"+name+"\t\t"+Marks+"%");
    }
}
class student2{
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       int n,i,r;
       float m;
       String nm;

       System.out.print("Enter How many Student :");
       n= sc.nextInt();
       Info2 arr[] = new Info2[n];
       
       for(i=0;i<arr.length;i++){
        System.out.print("Enter roll :");
        r = sc.nextInt();
        System.out.print("Enter name :");
        nm= sc.next();
        System.out.print("Enter marks :");
        m = sc.nextFloat();

        arr[i] = new Info2(r,nm,m);
         
       }

       System.out.println("\nAll Student info are as Followed ");
       System.out.println("ROLLNO \t\t NAME \t\t MARKS");
       for(Info2 t: arr){
            // System.out.println(t);// toString :Info2@37a71e93 (classname@hashcode)
            t.display();
       }


    }
}