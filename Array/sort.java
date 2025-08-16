import java.util.Scanner;
import java.util.Random;
class sort{
    public void sorting(int a[]) {
        int n = a.length;
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                if (a[j] > a[j+1]) {
                    // swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("\nSorted Array:");
        for (int x : a) {
            System.out.print(x + "\t");
        }
    }

    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       Random r = new Random();
        int n,i;
        System.out.print("Who many num U want to enter in an array : ");
        n = sc.nextInt();
        int A[] = new int[n];

        System.out.println(" Array element :");
        for(i=0;i<n;i++){
            A[i] = r.nextInt(100);
            System.out.print(A[i]+"\t");
        }

        sort ob = new sort();
        ob.sorting(A);
    }
}


