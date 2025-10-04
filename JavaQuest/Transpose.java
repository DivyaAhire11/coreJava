import java.util.*;

class Transpose{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        int rows,cols,i,j;

        System.out.print("Enter Number of Rows : ");
        rows = sc.nextInt();
        System.out.print("Enter Number of Columns : ");
        cols = sc.nextInt();

        int arr[][] = new int[rows][cols];
        int tr[][] = new int[cols][rows];

       System.out.println("Enter Elements in an array ");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
               arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements in an array As Follows ");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
               System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
              
       for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
               tr[j][i] = arr[i][j];
            }
        }

       System.out.println("Transpose array as follows :");
        for(i=0;i<cols;i++){    //colms = horizontal
            for(j=0;j<rows;j++){   //rows = verically
               System.out.print(tr[i][j]+"\t");
            }
             System.out.println();
        }
    }
}