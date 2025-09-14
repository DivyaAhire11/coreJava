package series;

public class EvenSeries{
    public static void printSeries(int n){
        System.out.println("\n-----Even Series-----");
        for(int i=1;i<=n;i++){
            if(i % 2 == 0)
               System.out.print(i +"\t");
        }
    }
}