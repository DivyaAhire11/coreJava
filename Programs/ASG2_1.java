import java.io.*;
import java.util.Arrays;

public class ASG2_1{
    public static void main(String a[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<a.length;i++){
            System.out.println("Command line argument ["+ i +"]:"+a[i]);

        }
        Arrays.sort(a);
        System.out.println("Elements of arrray Sorted in assending order ");
        for(int i=0;i<a.length;i++)
           System.out.print(a[i]+" ");
    }
}
/* OUTPUT
Command line argument [0]:mango
Command line argument [1]:apple
Command line argument [2]:banana
Elements of arrray Sorted in assending order
apple banana mango
*/