/*
    First Static Block 
    Second Static Block
    Third Static Block

    Main method Entry point

    First Init Block
    Second Init Block
    Third Init Block

    First Constructor

    First Init Block
    Second Init Block
    Third Init Block

    Second Constructor :5

    First Init Block
    Second Init Block
    Third Init Block

    Third Constructor : radha
*/

//Static Block -> for one time , class-level setup ( Run Once when class loads (before main)) 
//Init Block -> Run before Constructor , every time an Object Object is created
//Constructor -> run after Instance Init Block(IIB) is created ,Object Specific Initialization

public class Interesting1{
    //Valid Multiple Static Block
    static{
        System.out.println("First Static Block ");
    }
    static{
        System.out.println("Second Static Block");
    }
    static{
        System.out.println("Third Static Block");
    }

    //Init Blocks
    {
        System.out.println("First Init Block");
    }
    {
        System.out.println("Second Init Block");
    }
    {
        System.out.println("Third Init Block");
    }

    //Constructor

    Interesting1(){
      System.out.println("First Constructor");
    }
    Interesting1(int a){
      System.out.println("Second Constructor : "+a);
    }
    Interesting1(String b){
       System.out.println("Third Constructor : "+b);
    }
    
    public static void main(String[] args){
         System.out.println("Main method Entry point");
         Interesting1 ob = new Interesting1();
         Interesting1 ob2 = new Interesting1(5);
         Interesting1 ob3 = new Interesting1("radha");
    }
}