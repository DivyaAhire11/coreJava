/*
    I Love Java

    Static variable :Learner
    I am Static Block
    I am main method

    I Love C Lang

    instance variable :1
    I am Init Block
    I am Constructor

 */

public class Interesting2{
    static String a = m2();
    int b = m1();
    static{
        System.out.println("Static variable :"+a);
       System.out.println("I am Static Block");
    }
    
    {
        System.out.println("instance variable :"+b);
       System.out.println("I am Init Block");
    }
    int m1(){
       System.out.println("I Love C Lang");
       return 1;
    }
    static String m2(){
        System.out.println("I Love Java");
        return "Learner";
    }
    Interesting2(){
        System.out.println("I am Constructor");
    }
    
    public static void main(String args[]){
        System.out.println("I am main method");
        Interesting2 t = new Interesting2();
    }
}