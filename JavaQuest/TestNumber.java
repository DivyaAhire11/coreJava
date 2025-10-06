import java.util.*;
class ZeroException extends Exception{
    public String toString(){
         return "Number is Zero";
    }
   
}
class TestNumber{
    public static boolean isPrime(int n){
         boolean flag = true;
        for(int i = 2;i< Math.sqrt(n);i++){
            if(n%i == 0)
               flag = false;
               break;
        }
         return flag;
    }
    
    public static void main(String args[]){
       int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        n = sc.nextInt();

        try{
            if(n == 0){
                throw new ZeroException();
            }else if(isPrime(n)){
               System.out.println(n+" is Prime Number : ");
            }else{
               System.out.println(n+" is Not Prime Number : ");
            }
        }catch(ZeroException ze){
          System.out.println(ze);
        }
    }
}