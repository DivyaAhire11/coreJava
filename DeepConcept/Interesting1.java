/*
    First Static Block 
    Second Static Block
    Third Static Block
    Main method Entry point
    First Init Block
    Second Init Block
    Third Init Block
*/
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
    
    public static void main(String[] args){
         System.out.println("Main method Entry point");
         Interesting1 ob = new Interesting1();
    }
}