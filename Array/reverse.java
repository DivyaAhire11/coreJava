import java.util.Scanner;

class Demo{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n,i;
       System.out.print("Enter How many nums You Want? :");
       n = sc.nextInt();
       int a[] = new int[n];
       System.out.println("Enter Array Elements :");
       for(i = 0;i<a.length;i++){
          a[i] = sc.nextInt();
       }

    
    System.out.println("\n\nInput Array As Follow");
       for(i=0;i<a.length;i++){
         System.out.print(a[i]+"\t");
       }


       System.out.println("\n\nReverse Array As Follow");
       for(i=n-1;i>=0;i--){
         System.out.print(a[i]+"\t");
       }

    }
}