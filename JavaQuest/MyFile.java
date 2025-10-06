import java.io.*;

class MyFile{
    public static void main(String args[]){
        int ch;
        char ch1;
        if(args.length == 2){
            try{
                FileReader fr = new FileReader(args[0]); //pass file name source
                FileWriter fw = new FileWriter(args[1]); //book1.txt

                while((ch = fr.read()) != -1){
                    ch1 = (char)ch;
                    fw.write(ch1); 
                }
                fr.close();
                fw.close();
                System.out.println("File Copied SuccessFully ");
            }catch(Exception e){
                System.out.println(e);
            }
        }else{
            System.out.println("Pass Source and Destination file name");
        }
    }
}