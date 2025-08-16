import java.util.Scanner;

class student{
     private int roll;
     private String name;
     private float Marks;

     public void setRoll(int r){
        roll=r;
     }
     public void setName(String n){
        name=n;
     }
     public void setmarks(float m){
        Marks=m;
     }
     public int getRoll(){
        return roll;
     }
     public String getName(){
        return name;
     }
     public float getmarks(){
        return Marks;
     }
}
class testStudent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i,r;
        float m;
        String nm;
        System.out.print("Enter How many Student :");
        n = sc.nextInt();
        student s[] = new student[n];
        
        for(i=0;i<n;i++){
            System.out.print("Enter roll :");
            r = sc.nextInt();
            System.out.print("Enter name :");
            nm= sc.next();
            System.out.print("Enter marks :");
            m = sc.nextFloat();

            s[i]=new student();
            s[i].setRoll(r);
            s[i].setName(nm);
            s[i].setmarks(m);
        }
         System.out.println("\nAll Student info are as Followed ");
         System.out.println("ROLLNO \t\t NAME \t\t MARKS");
        for(student t: s){
           System.out.println(t.getName()+"\t\t"+t.getName()+"\t\t"+t.getmarks()+"%");
        }
    }
}