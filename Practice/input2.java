import java.util.Scanner;
import java.util.Random;

class input2{
    public static void main(String[] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int n,i,sum=0;
       
        System.out.print("who many number you want to enter : ");
         n = sc.nextInt();
        int arr[] = new int[n];
      
        System.out.println("All Number Are As Followed");
        for(i=0;i<arr.length;i++){
            arr[i]= r.nextInt(100);
            sum += arr[i];
        }
        // for(i=0;i<arr.length;i++)
        //     System.out.print(arr[i]+"\t");

        for(int t : arr) 
           System.out.print(t +"\t");

        System.out.println("\nSum of all numbers is :"+sum);
    }
}