import java.util.Scanner;

class Number{
    private int num;
    public Number(int num){
        this.num=num;
    }
    public boolean isPositive(){
        return (num>0);          
    }
    public boolean isNegative(){
        return (num<0);
    }
    public boolean isZero(){
        return (num == 0);
    }
    public boolean isEven(){
        return (num % 2 == 0);
       
    }
    public boolean isOdd(){
        return (num % 2 != 0);
   
    }
}

class testNum{
    public static void main(String args[]){
        int len,num,ch;
        boolean ans;
        len = args.length;
        if(len == 1){
            try{
                num = Integer.parseInt(args[0]);
                Number ob = new Number(num);
                    if(ob.isPositive())
                        System.out.println("Number is Positive");

                    if( ob.isNegative())
                        System.out.println("Number is Negative");

                    if(ob.isZero())
                        System.out.println("Number is Zero");

                    if(ob.isEven())
                        System.out.println("Number is Even");

                    if(ob.isOdd())
                        System.out.println("Number is odd");

            }catch(Exception e){
                System.out.println("Something Happened! Required Valid Integer Only");
            }


        }else{
            System.out.println("Give one cmd-line argument");
        }
    }
}  

