
interface A{
    void m1();
    void m2();
}

class B implements A{
    public void m1(){
        System.out.println("m1() of B class");
    }
    public void m2(){
        System.out.println("m2() of B class");
    }
}
class Test{
    public static void main(String args[]){
        A ob = new B(); //Super class ref = subclass object
        ob.m1();
        ob.m2();
    }
}