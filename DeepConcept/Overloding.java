public class Overloding{
    public static void main(){  //2
        System.out.println("2. main Method WITHOUT ARGUMENT ");
    }
    public static void main(String abc){ //3
        System.out.println("3 .main method WITH ARGUMENT :" + abc);
    }
    public void main(float aa){ //5
        System.out.println("5 .WITHOUT STATIC main method  :"+aa);
    }
    private static void main(int a){//4
        System.out.println("4 .PRIVATE main method :"+a);
    }
    private void main(String a,float b){ //6
        System.out.println("6 .WITHOUT STATIC and PRIVATE main method  :"+a +"  "+b);
    }
    void main(int b,String c){//7
        System.out.println("7 .main method WITHOUT STATIC and ACCESS SPECIFIER :"+b+"  "+c);
    }
    int main(int t,int tt ,int ttt){//8
        System.out.println("8 .main method WITH RETURN TYPE :"+t+"  "+tt+"  "+ttt);
        return 1;
    }
    public static void main(String args[]){
        System.out.println("1 .I am main Method of MAIN CLASS"); //1
        //static content
        main(); 
        Overloding.main("hello");
        Overloding.main(5);
        
        // cannot be referenced from a static context 
        //Calling using Objects
        Overloding ob = new Overloding();
        ob.main(3.5f);
        ob.main("divya",9.45f);
        ob.main(10,"xyz");
        int t = ob.main(5,10,15);
    }
}