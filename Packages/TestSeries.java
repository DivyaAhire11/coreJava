package mainseries;

import java.util.Scanner;
import series.SquareSeries;
import series.CubeSeries;

class TestSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter Number :");
        int n = sc.nextInt();

        SquareSeries.printSeries(n);
        CubeSeries.printSeries(n);
    }
}