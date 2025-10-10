import java.util.Scanner;

class MyArithmeticException extends Exception{
    public String toString(){
         return "Number can not divided by Zero";
    }
}

class Demo{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        int a,b,c=1;
        System.out.print("Enter First Number : ");
        a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        b = sc.nextInt();
        try{
          if(b == 0){
             throw new MyArithmeticException();
          }else{
             c = a/b;
             System.out.println("Result is : "+c);  
          }
        }catch(MyArithmeticException ae){
            System.out.println(ae); // ae.toString()
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("EXIT OF MAIN METHOD");
    
    }
}