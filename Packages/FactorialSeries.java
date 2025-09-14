package series;

public class FactorialSeries{
    public static void printSeries(int n){
        System.out.println("\n------Factorial Series-----");
        for(int i = 1;i <= n;i++){
            int fact = 1;
            for(int j=1;j<=i;j++){
                fact *= j;
                        
            }
           System.out.print(i +"! = " +fact+"\t\t");
        }
    }
}