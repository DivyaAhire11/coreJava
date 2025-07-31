//BITWISE OERATOR
class operator5{
     public static void main(String agrs[]){
        int a = 37;
        int b = 68;
        System.out.println("Result of a&b is :"+ (a&b)); //4
        System.out.println("Result of a|b is :"+ (a|b)); //101
        System.out.println("Result of a^b is :"+ (a^b)); //97


        byte c = 9;
         System.out.println("Result of ~c is :"+(~c));//-10
         System.out.println("Result of ~12 is :"+(~12));//-13
        byte d = -6;
         System.out.println("Result of ~d is :"+(~d));//5
         byte e = -9;
         System.out.println("Result of ~e is :"+(~e));//8


        byte x=4;
         System.out.println("Result of x<<1 is :"+ (x<<1)); //8
         System.out.println("Result of x>>1 is :"+ (x>>1));//2
         System.out.println("Result of x<<2 is :"+ (x<<2));//16


         byte y = -1;
          System.out.println("Result of y>>>1 is :"+ (y>>>1)); //2147483647

     }
}