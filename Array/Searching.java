import java.util.Scanner;

class Searching{

    public void search(int arr[],int sk){
        int flag=0;
        for(int i = 0; i<arr.length ; i++){
            if(arr[i] == sk){
                flag = 1;
                break;
            }
         }   
            if(flag == 1)
                  System.out.println(sk+"  PRESENT in an array");
            else
                  System.out.println(sk+"  NOT FOUND in an array");
      
    }

     public static void main(String[] abcd){
        Scanner sc = new Scanner(System.in);
        int n,i,sk;
        System.out.print("Enter a Number :");
        n = sc.nextInt();
       
       System.out.print("Enter values :");
        int a[] = new int[n];
        for(i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        Searching s = new Searching();
        System.out.println("Which number you want to search :");
        sk = sc.nextInt();
        s.search(a,sk);
     }
}