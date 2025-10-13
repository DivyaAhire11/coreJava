import java.io.*;

class ReadFile{
   public static void main(String args[]){
      try{
          int ch;
          if(args.length == 1){
            FileReader fr = new FileReader(args[0]);
            while((ch = fr.read()) != -1){
                char ch1 = (char)ch;
                System.out.print(ch1);
            }
          }else{
            System.out.println("Pass one File as an argument.");
          }
          
      }catch(FileNotFoundException fn){
         System.out.println(fn);
      }catch(IOException e){
         System.out.println(e);
      }
   }
}