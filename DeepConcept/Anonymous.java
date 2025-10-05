
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
class C implements A{
    public void m1(){
        System.out.println("m1() of C class");
    }
    public void m2(){
        System.out.println("m2() of C class");
    }
}
class Test{
    public static void main(String args[]){
        A ob = new B(); //Super class ref = subclass object
        ob.m1();
        ob.m2();

        A ob1 = new C();
        ob1.m1();
        ob1.m2();

        A ob2 = new A(){       //Test$1.class
             public void m1(){
                  System.out.println("m1() of Class Without Name");
             }
              public void m2(){
                  System.out.println("m2() of Class Without Name");
              }
        };
        ob2.m1();
        ob2.m2();

        B ob3 = new B(){         //Test$2.class
            public void m1(){
                System.out.println("HIIIII");
            }
        };
        ob3.m1();
    }
}
/*
OUTPUT
m1() of B class
m2() of B class
m1() of C class
m2() of C class
m1() of Class Without Name
m2() of Class Without Name
HIIIII
*/