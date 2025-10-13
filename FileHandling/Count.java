import java.io.*;

class Count{
    public static void main(String args[]){
        try{
            int ch,wc=1,lc=1,cnt=0;
            char ch1;
            if(args.length == 1){
                FileReader fr = new FileReader(args[0]);
                while((ch = fr.read()) != -1){
                    cnt++;
                    ch1 = (char)ch;
                    if(ch1 == ' '){
                       wc++; 
                    }
                    if(ch1 == '\n'){
                        wc++;
                        lc++;
                    }
                }

                System.out.println("Total Words in File :"+wc);
                System.out.println("Total Lines in File :"+lc);
                System.out.println("Total Charecters in File : "+cnt);
            
            }else{
                 System.out.println("Pass one File as an argument.");
            }
        }catch(FileNotFoundException fn){
             System.out.print(fn);
        }catch(IOException ie){
            System.out.print(ie);
        }
    }
}