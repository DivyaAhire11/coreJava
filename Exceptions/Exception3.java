import java.util.*;

class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = 0, index = 0;
        int a[] = new int[10];

        System.out.print("Enter First Number : ");
        try {
            x = sc.nextInt();   //throw new InputMismatchException()
        } catch (InputMismatchException ime) {  
            System.out.println("Invalid input for number: " + ime);
            sc.next(); // clear invalid token
        }

        System.out.print("Enter Index : ");
        try {
            index = sc.nextInt(); //throw new InputMismatchException()
        } catch (InputMismatchException ime) {
            System.out.println("Invalid input for index: " + ime);
            sc.next(); // clear invalid token
        }

        try {
            a[index] = x;   //throw new ArrayIndexOutOfBoundsException()
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println(aiob);
        }

        for (int t : a) {
            System.out.println(t);
        }

          System.out.println("EXIT OF MAIN METHOD");
    }
}
