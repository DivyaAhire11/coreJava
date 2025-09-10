/*
    I Love Java
    I am Static Block
    I am main method
    I am Init Block
    I am Constructor

 */

public class Interesting2{
    static int b = m2();
    static{
       System.out.println("I am Static Block");
    }
    
    {
       System.out.println("I am Init Block");
    }
    void m1(){
       System.out.println("I am Instance method");
    }
    static int m2(){
        System.out.println("I Love Java");
        return 1;
    }
    Interesting2(){
        System.out.println("I am Constructor");
    }
    
    public static void main(String args[]){
        System.out.println("I am main method");
        Interesting2 t = new Interesting2();
    }
}