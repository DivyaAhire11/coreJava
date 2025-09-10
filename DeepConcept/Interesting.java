/*
1.Static variable value :7
2.Static Block
3.Main method Entry point
4.Instance variable value :hello
5.Init Block
6.Constructor
7.m1() method

*/

public class Interesting{
    static int a= 7;
    String b = "hello";
    static{
          System.out.println("Static variable value :"+a);    
        //   System.out.println("Instace variable value :"+b); error//non-static variable b cannot be referenced from a static context
          System.out.println("Static Block"); 
    }
    void m1(){
         System.out.println("m1() method");
    }
    {
        // System.out.println("Static variable value :"+a); //Allowed
        System.out.println("Instance variable value :"+b);
         System.out.println("Init Block");
    }
    private Interesting(){ //Construct can be Private But Object Should be created from same class
         System.out.println("Constructor ");
    }
    public static void main(String args[]){
        System.out.println("Main method Entry point");
      
        Interesting ob = new Interesting();
        ob.m1();
    }
}