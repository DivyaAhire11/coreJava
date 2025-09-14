package series;

public class PrimeSeries {
    public static void printSeries(int x) {
        System.out.println("\n\n----- Prime Series -----");
        
        for (int i = 2; i <= x; i++) {
            boolean isPrime = true; // assume number is prime

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false; // found a divisor
                    break;           // stop checking further
                }
            }

            if (isPrime) {
                System.out.print(i + "\t");
            }
        }
    }
}
