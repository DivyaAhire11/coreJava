import java.io.*;

class Myfile{
    public static void main(String args[]){
        int ch;
        char ch1;
        int wc = 0,lc =1;
        try{
            if(args.length == 1){
                BufferedReader br = new BufferedReader(new FileReader(args[0]));
                while((ch = br.read())  != -1){
                    ch1 = (char)ch;
                    if(ch == ' ')
                       wc++;
                    else if(ch == '\n'){
                        wc++;
                        lc++;
                    }
                }
                System.out.println("Number of words : "+wc);
                System.out.println("Number of lines : "+lc);
            }else{
                System.out.println("pass File name as an Argument");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}