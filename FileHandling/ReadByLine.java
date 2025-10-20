import java.util.*;
import java.io.*;

class ReadByLine{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String fname;
        String line;
        try{
            System.out.print("Enter File Name : ");
            fname = sc.next();
           
           BufferedReader br = new BufferedReader( new FileReader(fname));
          
            while((line = br.readLine()) != null){ // BufferedReader class = readLine() =  public java.lang.String readLine() throws java.io.IOException;
                System.out.println(line);
            }
              br.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}