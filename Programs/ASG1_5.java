import java.util.Scanner;
import java.util.Arrays;

class matrixOperation {
    public static int[][] add(int [][]a,int[][] b){
        int row = a.length;
        int column = a[0].length;
        int sum[][] = new int[row][column];
        for(int i = 0;i < row;i++){
            for(int j = 0;j < column;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    public static int[][] subtract(int [][]a,int[][] b){
        int row = a.length;
        int column = a[0].length;
        int sub[][] = new int[row][column];
        for(int i = 0;i < row;i++){
            for(int j = 0;j < column;j++){
                sub[i][j] = a[i][j] - b[i][j];
            }
        }
        return sub;
    }

    public static int[][] multiplication(int [][]a,int[][] b){
        int row = a.length;
        int column = b[0].length;
        int product[][] = new int[row][column];
        for(int i = 0;i < row;i++){
            for(int j = 0;j < column;j++){
                product[i][j] = 0;
                for(int k=0; k < a[0].length; k++){
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }

    public static int[][] transpose(int[][] a){
        int row = a.length;
        int column = a[0].length;
        int temp[][] = new int[column][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                temp[j][i] = a[i][j];
            }
        }
        return temp;
    }
}

class fifth {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a[][] = {{5,6,7},{8,9,10},{3,1,2}};
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int c[][] = new int[3][3];

        System.out.println("A = "+Arrays.deepToString(a));
        System.out.println("B = "+Arrays.deepToString(b));

        do{
            System.out.println("Options Select");
            System.out.println("1 . Addition");
            System.out.println("2 . Subtraction");
            System.out.println("3 . Multiplication");
            System.out.println("4 . Transpose");
            System.out.println("5 . Exit");
            System.out.println("------------------------");

            System.out.println("Enter Your choice :");
            int ch = sc.nextInt();
            switch(ch){
                case 1 : c = matrixOperation.add(a,b);
                         System.out.println("Sum of matrix : ");
                         System.out.println(Arrays.deepToString(c));
                         break;
                case 2 : c = matrixOperation.subtract(a,b);
                         System.out.println("Subtraction of matrix : ");
                         System.out.println(Arrays.deepToString(c));
                         break;
                case 3 : c = matrixOperation.multiplication(a,b);
                         System.out.println("Multiplication of matrix : ");
                         System.out.println(Arrays.deepToString(c));
                         break;
                case 4 : System.out.println("Transpose of first matrix : ");
                         c = matrixOperation.transpose(a);
                         System.out.println(Arrays.deepToString(c));
                         System.out.println("Transpose of second matrix : ");
                         c = matrixOperation.transpose(b);
                         System.out.println(Arrays.deepToString(c));
                         break;
                case 5 : System.exit(0);
                         return;
                default : System.out.println("Invalid input");
            }
        }while(true);
    }
}
