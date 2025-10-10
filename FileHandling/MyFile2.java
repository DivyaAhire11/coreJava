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
            System.out.println("Size of a File : "+f.length());
            System.out.println("Hidden: : "+ f.isHidden());
            System.out.println("Absolute Path of a File : "+ f.getAbsolutePath());
            System.out.println("path of a File : "+ f.getPath());
            System.out.println("Name of a File : "+f.getName());

        }else if(f.isDirectory()){
            System.out.println(fname + " isa directory");
        }else{
            System.out.println("File "+fname+" is Not a File and Not Directories ");
        }

    }
}