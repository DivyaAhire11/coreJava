import java.io.*;
import java.util.*;

class MyFile{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String fname;

        System.out.print("Enter File Name : ");
        fname = sc.next();

        File f = new File(fname);
        if(f.isFile()){
            System.out.println(fname +" is a file");
        }else if(f.isDirectory()){
            System.out.println(fname + " isa directory");
        }else{
            System.out.println("File "+fname+" is Not a File and Not Directories ");
        }

    }
}