import java.io.*;
import java.util.*;

class MyFile{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
            if(args.length == 1){
              String fname = args[0];
              File f = new File(fname);
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
                for(String c:content){
                     System.out.println(c);
                }
                System.out.println("\n-----TXT FILES----");
                 int cnt=0;
                 for(String c:content){
                    if(c.endsWith("txt")){
                      System.out.println(c);
                      cnt++;
                  }
                }

                System.out.println("\nTotal Number OF TXT files : "+cnt);
               
                String ch;
               for(String c:content){
                  File ff  = new File(fname+"\\"+c);
                  if(ff.isFile() && c.endsWith("txt")){
                    System.out.println(c + " is FOUND");
                    System.out.println("Do you Want To DELETE (yes/no) :");
                        ch = sc.next();
                    if(ch.equalsIgnoreCase("yes")){
                      ff.delete();
                      System.out.println("DELETE SUCCESSFULLY");
                     }
                  }
                }
              }
              
            }else
                 System.out.println("Pass One File as an Argument.");
            
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