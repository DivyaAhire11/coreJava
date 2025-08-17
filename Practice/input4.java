import java.io.*;

public class input4{
    public static void main(String args[])throws Exception{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int a,b;
          System.out.print("Enter two number : ");
          a = Integer.parseInt(br.readLine());
          b = Integer.parseInt(br.readLine());
          System.out.println("Total is : "+(a+b));
    }
}