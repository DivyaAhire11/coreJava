
@FunctionalInterface
interface A{
    void m1();
}

class B implements A{
    public void m1(){
        System.out.println("Hello");
    }
}
class C implements A{
    public void m1(){
        System.out.println("Good Day");
    }
}
class D extends B{
     void m2(){
        System.out.println("Good BYE");
    }
}
class Testing{
    public static void main(String args[]){
        A ob = new B();
        ob.m1(); // Hello
     
        A ob1 = new C();
        ob1.m1(); // Good Day
        
        B ob2 = new D();
        // ob2.m2(); //cannot find symbol
        ob2.m1(); // Hello

         D ob3 = new D();
         ob3.m2(); //Good BYE
    }
}