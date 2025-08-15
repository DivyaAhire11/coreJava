import java.util.Scanner;

class info{
    private int roll;
    private String name;
    private float mks;
    private String clgname;

    public void setInfo(int roll,String name,float mks,String clgname){
        this.roll = roll;
        this.name = name;
        this.mks = mks;
        this.clgname = clgname;
    }

    public void getInfo(){
        System.out.println("-------------------------");
        System.out.println("NAME IS :"+ name);
        System.out.println("ROLL IS :"+ roll);
        System.out.println("MARKS IS :"+ mks+"%");
        System.out.println("COLLEGE NAME IS :"+ clgname);
    }
}
class studInfo{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        info ob = new info();
        //input from user
       
        System.out.print("enter college name : ");
        String clg = sc.nextLine(); 

        System.out.print("enter roll number : ");
         int r = sc.nextInt(); 

        System.out.print("enter name : ");
         String nm = sc.next(); 

         System.out.print("enter marks : ");
         float m = sc.nextFloat(); 

        ob.setInfo(r,nm,m,clg);
        ob.getInfo();
       
    }
}