import java.util.*;

class CitySort{
    void sort(String city[]){
        int i,j,n;
        String temp;
        n = city.length;
        for(i=0;i<n-1;i++){
           for(j=0;j<n-i-1;j++){
            if(city[j].compareTo(city[j+1]) > 0){
               temp = city[i];
               city[i] = city[j];
               city[j] = temp;
             }
           }
        }
    }

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number of city :");
       int n = sc.nextInt();
       String city[] = new String[n];
       System.out.println("Enter  City names ");
       for(int i=0;i<city.length;i++){
          city[i] = sc.next();
       }
       CitySort cs = new CitySort();
       cs.sort(city);

        System.out.println("\n AFTER SORTING CITYS ARE AS FOLLOWS");
        for(int i=0;i<city.length;i++){
          System.out.print(city[i]+"\t");
       }
    }
}