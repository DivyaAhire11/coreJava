// Reverse Array

// import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASG1_2{
      public static void main(String args[])throws IOException{
           int n,j=0,i;
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
           System.out.print("Enter Size of an Array :");
            n = Integer.parseInt(br.readLine());
           int arr[] = new int[n];
           int rev[] = new int[n];
           
           System.out.println("Enter Array Inputs: ");
           for( i=0; i<n;i++){
            //   System.out.println(arr[i]);// BY DEFAULT 0
             arr[i] = Integer.parseInt(br.readLine());
           }

           System.out.println("Original Array is : ");
            for( i=0; i<n;i++){
               System.out.print(arr[i]+"\t");
           }
          
           System.out.println("\nReverse array is : ");
            for( i=n-1; i>=0;i--,j++){
                rev[j] = arr[i];
                System.out.print(rev[j]+"\t");
           }
      }
}