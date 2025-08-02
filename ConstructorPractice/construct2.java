package Constructor;
class A {
    A() {
        this(10, "ritu");
        System.out.println("Constuctor with no parameter");// 2nd
    }

    A(int x) {
        this(); // constuctor call explicitly with help of this()
        System.out.println("one parameter Constuctor " + x); // 3rd
    }

    A(int x, String y) {
        System.out.println("two parameter Constuctor ");// 1 execute
    }

    void m1() {
        System.out.println("m1() method");// 4rth
    }

    void m2() {
        m1();
        System.out.println("m2() method");// 5th
    }

}

class AAA {
    public static void main(String[] args) {
        A ob = new A(34);
        ob.m2();
    }
}