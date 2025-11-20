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

        System.out.println("\nmin : " + min);
        System.out.println("Second min : " + secMin);
    }
}
