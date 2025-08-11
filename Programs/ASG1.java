import java.io.*;

public class ASG1{
    public static void main(String args[])throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       while(true){
        System.out.println("Choose Any Choice");
        System.out.println("1 : Volume of Cylender ");// V = pi*r*r*h
        System.out.println("2 : Factorial ");
        System.out.println("3 : Armstrong ");
        System.out.println("4 : Exit");
        System.out.println("Enter Your Choice : ");

        int ch  =Integer.parseInt(br.readLine());
        switch(ch){
            case 1 : 
                    System.out.print("Enter Radius : ");
                    Float r = Float.parseFloat(br.readLine());
                    System.out.print("Enter Height : ");
                    Float h = Float.parseFloat(br.readLine());
                    Float V = 22/7*r*r*h;
                    System.out.println("Volume of cylinder is : "+V);
                    break;
       }
       }
    }
}
