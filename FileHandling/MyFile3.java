import java.io.*;

class MyFile{
    public static void main(String args[]){
            if(args.length == 1){
              File f = new File(args[0]);
              if(f. isFile()){
                 System.out.println(args[0]+" Is a File");
                 System.out.println("Hidden File??? :"+f.isHidden());
                 System.out.println("File Readable? : "+f. canRead());
                 System.out.println("File Writable? :"+f. canWrite());
                 System.out.println(" Get name of File :"+ f.getName());
                 System.out.println(" Path of File : "+f.getPath());
                 System.out.println("Absolute Path of File : "+f. getAbsolutePath());
                 
              }else if(f.isDirectory()){
                System.out.println(args[0]+" IS a Directory");
                String[] content = f.list();
                System.out.println("------DIRECTORY CONTENT ------");
                for(String c:content)
                     System.out.println(c);
               }
                
            }else{
                 System.out.println("Pass One File as an Argument.");
            }
    }
}
/*
Demo IS a Directory
------DIRECTORY CONTENT ------
demo.java
hello.txt
InnerDemo
xyz.txt

*/