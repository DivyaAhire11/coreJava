class ABC{
    int a;
    int b;
    int c;
    static int d;

    ABC(){
        a = 5;
        b= 10;
        c = 469;
        d = 939;
    }

    void m1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        

    }
    static void m2(){
        //   System.out.println(a);//error non-static variable a cannot be referenced from a static context
          System.out.println(d);

    }
}
class testABC{
    public static void main(String[] args){
         ABC ob = new ABC();
         ob.m1();
         ABC.m2();
    }
}