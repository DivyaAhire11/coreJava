import java.util.*;

public class Qestion1 {
    public static void main(String args[]){
       Random r = new Random();
       Scanner sc = new Scanner(System.in);

       int n ,i ;
       System.out.println("Enter How Many Elements in an array : ");
       n = sc.nextInt();

       int arr[] = new int[n];
       for(i=0;i<n;i++){
         arr[i] = r.nextInt(100);
       }

       for(int t : arr)
        System.err.print(t + "\t");
    }
}
