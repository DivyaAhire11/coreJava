import java.util.*;

class Person{
    private String FirstName;
    private String LastName;

    float BMI(float h,float w){
       float BMI;
       BMI = w / (h * h);
       return BMI;
    }
    public static void main(String p[]){
       Scanner sc = new Scanner(System.in);
        if(p.length == 2){
            int i;
            float height,weight,bmi;
            Person ps = new Person();

            height = Float.parseFloat(p[0]);
            weight =Float.parseFloat(p[1]);
           
            System.out.print("Enter Your First name :");
            ps.FirstName = sc.next();
             System.out.print("Enter Your Last name :");
            ps.LastName = sc.next();

            bmi = ps.BMI(height,weight);
            System.out.println("BMI of "+ps.FirstName+" "+ps.LastName+" is : "+bmi);
        }else{
            System.out.println("required height and weight");
        }
    }
}