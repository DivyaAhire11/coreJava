import java.util.*;

public class Question1 {
    public static void main(String args[]) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int n, i;
        System.out.print("Enter How Many Elements in an array : ");
        n = sc.nextInt();

        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = r.nextInt(100);
        }

        System.out.println("All Numbers are as follows : ");
        for (int t : arr)
            System.err.print(t + "\t");

        int min, secMin;
        min = secMin = Integer.MAX_VALUE;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secMin = min;
                min = arr[i];
            } else if (arr[i] < secMin) {
                secMin = arr[i];
            }
        }
      
        if(secMin == Integer.MAX_VALUE){
         System.out.println("\n There is no second smallest number");
        }else{
              System.out.println("\nSmallest Number : " + min);
        System.out.println("Second Smallest Number : " + secMin);
        }


      
    }
}
