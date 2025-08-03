class ABC{
    int a; 
    int b;
    int c;
    static int d; //static variable

    ABC(int x, int y,int z){
        a = x;
        b= y;
        c = z;
       
    }

    void m1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
    static void m2(){
        //   System.out.println(a);//error non-static variable a cannot be referenced from a static context
             System.out.println(d);

    }
}
class testABC{
    public static void main(String[] args){
         ABC ob = new ABC(10,20,40);
         ABC ob1 = new ABC(843,893,7);
         ABC ob2 = new ABC(27,82,92);
         ob.m1();
         ob1.m1();
         ob2.m1();
         ABC.m2();
    }
}