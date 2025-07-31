//OVERLOADING METHODS


public class methodTypes {
    public void m1() {
        System.out.println("no parameter");
    }

    public void m1(int x) {
        System.out.println("One parameter =" + x);
    }

    public void m1(int x, String y) {
        System.out.println("Two parameter = " + x + " " + y);
    }

    public void m1(String msg) {
        System.out.println("message : " + msg);
    }

    public void m1(int a, float b) {
        System.out.println("Two parameter : " + a + " " + b);
    }
}

class Instagram{
    public void login(String name,String password){
        System.out.println("name 1 : "+name);
    }
    public void login(String name,String password,long uid,String pan){
        System.out.println("name 3: "+name );
    }
    public void login(String name,String password,String email){
        System.out.println("name 4 : "+name );
    }
}

class Testmethods {
    public static void main(String args[]) {
        methodTypes ob = new methodTypes();
        ob.m1();
        ob.m1(5);
        ob.m1("Good day");
        ob.m1(543, 93.4f);
        ob.m1(8375, "hello");

       // Insta login overloding methods object 
        Instagram obj = new Instagram();
        obj.login("divya", "123","shdkasj@gmail.com");
       
    }
}