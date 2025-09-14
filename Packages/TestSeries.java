package mainseries;

import java.util.Scanner;
import series.*;
// import series.SquareSeries;
// import series.CubeSeries;
// import series.EvenSeries;

class TestSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter Number :");
        int n = sc.nextInt();

        SquareSeries.printSeries(n);
        CubeSeries.printSeries(n);
        EvenSeries.printSeries(n);
        FactorialSeries.printSeries(n);

    }
}