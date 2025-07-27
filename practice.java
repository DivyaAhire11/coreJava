class ABC{
    public static void main(String args[]){
    //  int a=3;
    //  int b=6;
    //  System.out.println("addition of "+a+" and "+b+" is :"+(a+b));
  

      //Range of byte is (-128 to 127)

     byte a= 127;
     System.out.println("Byte number: " +a);  //a = 127

     byte b= (byte)128;
     System.out.println("Byte number: " +b);  // a = -128

    byte c= (byte)140;
     System.out.println("Byte number: " + c);  //c = -116

     short s = (short)82382;
     System.out.println("Short number :"+s);  //s = 16846

     int x = (short)82382;
     System.out.println("Short number :"+(short)x); //x = 16846

     long l= 38389258233823L;
     System.out.println("long number is:"+l); // l = 38389258233823

     long p= 383892582;   
     System.out.println("long number is:"+p);  // p = 383892582

    float f = 2.5f;
    System.out.println("Floating number is :"+f); //f = 2.5
   
    //  int a = 20;
    //  float b = 37.3f;
    //  System.out.println("addition of "+a+" and "+b+" is "+(a+b));

//     char = ' '
//    String = " "

    char ch = 'A';
    System.out.println("charecter is :"+ch);  //A
    System.out.println("charecter is :"+(ch+1));  //66
    System.out.println("charecter is :"+ (int)ch); //65
    System.out.println("charecter is :"+ (char)(ch+1)); //B

    // int a = 4;
    // int b = 9;
    // boolean z = a>b;
    // System.out.println("boolean is :"+z); //false

    // while(false){  // Compile time error unreachable statement
    //      System.out.println("hello");
    // }

    }
}