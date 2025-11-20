/*
Input Accepted From Comand Line
*/

public class Args {
    public static void main(String[] args) {
        int n = args.length;
        if(n > 0){
            for(int i=0;i<args.length;i++)
            System.out.println("Args["+i+"] = "+args[i]);
        }else{
            System.out.println("Please Provide Argument in Command Line");
        }
            
       
    }
}
