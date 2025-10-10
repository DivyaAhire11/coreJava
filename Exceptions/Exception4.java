import java.util.*;

class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = 0, index = 0;
        int a[] = new int[10];
        try{
             System.out.print("Enter First Number : ");
             x = sc.nextInt();

             System.out.print("Enter Index: ");
             index = sc.nextInt();

             a[index] = x;
      
        }catch (InputMismatchException ime){
            System.out.println(ime);
        }catch(ArrayIndexOutOfBoundsException aiob){
            System.out.println(aiob);
        }catch(Exception e){
            System.out.println(e);
        }

        //Display Message
       for (int t : a) {
            System.out.print(t+"\t");
        }

          System.out.println("\nEXIT OF MAIN METHOD");
    }
 }