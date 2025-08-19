import java.util.Arrays;

public class ASG2_1 {
    public static void main(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Command line argument [" + i + "]: " + a[i]);
        }

        Arrays.sort(a);
        System.out.println("Elements of array Sorted in ascending order:");
        for (String s : a) {
            System.out.print(s + " ");
        }
    }
}

/* OUTPUT
Command line argument [0]:mango
Command line argument [1]:apple
Command line argument [2]:banana
Elements of arrray Sorted in assending order
apple banana mango
*/