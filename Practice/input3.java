//Using BufferdReader 
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
import java.io.*;

class input3{
   public static void main(String args[]){
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int a=0,b=0;
       try{ //handle exception
        System.out.print("Enter TWO number : ");
        a= Integer.parseInt(br.readLine());
        b= Integer.parseInt(br.readLine());
       }catch(IOException e){
          System.out.println("Something went Wrong but handled");
       }
      
       System.out.println("Total is :"+(a+b));
   }
}