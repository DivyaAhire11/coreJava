import java.util.Scanner;

class arrHandling{
      //Sum of all values in an array
      public void summation(int arr[]){
       int sum=0;
       for(int i=0; i<arr.length ; i++){
        sum += arr[i];
        }
        System.out.println("Sum of array is :"+sum);
      }

       //find minimum and maximum value in an array
       public void MaxMin(int arr[]){
          int min =arr[0] , max = arr[0];
         for(int i=0; i<arr.length ; i++){
            if(min > arr[i]) 
               min = arr[i];
            else if(max < arr[i])
              max = arr[i];
        }
          System.out.println("min number is :"+min);
          System.out.println("max number is :"+max);
       }

       //display array
       public void display(int arr[]){
           for(int i=0; i<arr.length ; i++){
           System.out.print(arr[i]+"\t");
        }
      }

    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       arrHandling ob = new arrHandling(); //object 

        System.out.print("Enter number :");
        int x,i;
        x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Input "+x+" Elements");
        //input array
        for(i=0; i<x ; i++){
        arr[i] = sc.nextInt();
        }
        
        //calling object
        ob.summation(arr);
        ob.MaxMin(arr);
        ob.display(arr);
    }
}