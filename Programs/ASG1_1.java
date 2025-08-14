import java.io.*;

public class ASG1{
    public static void main(String args[])throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       while(true){
        System.out.println("\nChoose Any Choice");
        System.out.println("1 : Volume of Cylender ");// V = pi*r*r*h
        System.out.println("2 : Factorial ");
        System.out.println("3 : Armstrong ");
        System.out.println("4 : Exit");
        System.out.println("----------------------");
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

            case 2 : System.out.print("Enter Number : ");
                    int n = Integer.parseInt(br.readLine());
                    int fact=1;
                    for(int i = 1 ; i<=n ; i++){
                        fact = fact * i; 
                    }
                    System.out.println("factorial of "+n+" is : "+ fact);
                    break;

            case 3 : System.out.print("Enter Number : ");
                    int no = Integer.parseInt(br.readLine());
                   
                    int num, rem,result =0;
                    int numDigits = String.valueOf(no).length(); //find lenght
                   
                    num = no; 
                    while(num != 0){  //2
                        rem = num %10;  //unit place=2
                        result += Math.pow(rem , numDigits);
                        num /= 10; 
                    }
                    if(result == no)
                       System.out.println(no +" is an Armstrong number");
                    else 
                       System.out.println(no +" is not an Armstrong number");
                    break;
            case 4 : System.exit(0);
            default : System.out.println("InValid choice");
       }
       }
    }
}
