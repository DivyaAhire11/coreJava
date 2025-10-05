import java.util.*;

@FunctionalInterface
interface Operation{
    int cube(int x);
}

class OpPerformed{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Number : ");
        n = sc.nextInt();
        Operation o = (x) -> x*x*x;
        System.out.println("Cube of "+n+" is : "+o.cube(n));
    }
}