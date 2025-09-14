package series;
//0 1 1 2 3 5 8 13 21 
public class FibonacciSeries{
    public static void printSeries(int n){
        System.out.println("\n\n-----Fibonacci Series-----");
        int a = 0, b = 1,ans,i;
         System.out.print(a + "\t");
         System.out.print(b + "\t");
        for(i = 1;i < n;i++){
            ans = a+b;
            System.out.print(ans + "\t");
            a = b;
            b = ans;
        }
    }
}