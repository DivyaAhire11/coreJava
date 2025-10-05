@FunctionalInterface
interface A{
    void m1();
}

class B implements A{
    public void m1(){
       System.out.println("BE TALENTED");
    }
}
class Test{
    public static void main(String args[]){
        A ob = new B();
        ob.m1();
     
        A ob1 = new A(){        
           public void m1(){
              System.out.println("BE SMART");
           }
        };
        ob1.m1();

        A ob2 = () -> { System.out.println("BE INDEPENDENT");};
        ob2.m1();
        
    }
}