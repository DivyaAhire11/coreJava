

class operator4{
    public static void main(String arja[]){
        int N = 5;
        N++;
        System.out.println("after increment :"+N);

        int M = 5;
        M--;
        System.out.println("after decrement :"+M);
       
        int P = 5;
        ++P;
        System.out.println("Pre increment :"+P);

         int Q = 5;
        --Q;
        System.out.println("pre decrement :"+Q);


         int a =5;
         int b = 2;


       int c = a++ + b;      // 1] 5+2= 7 , 2] 5++ = 6
       System.out.println(c); //7
       System.out.println(a);  //6

       int d = a * b--;       // 1] 5*2 = 10  , 2] 2-- = 1
       System.out.println(d);  //10
       System.out.println(b);  //1

       int e = a---b;        //(a-- - b) 1] 5-2 = 3  , 2] a-- (5--)=4 , 3] b=2
       System.out.println(e); //3
       System.out.println(a); //4
       System.out.println(b); //2

       int f = ++a + b;        //1] ++a(++5)=6 , 2] 6+2 =8
       System.out.println(f);   //8
       System.out.println(a);   //6

 
        //  int g = a++ ---b;       // error: unexpected type
         int g = a++ - --b;      //1] a - (--b) = 5-1=4 , 2] a++(5++)=6 3]b=1
         System.out.println(g);  //4
         System.out.println(a);  //6
         System.out.println(b);  //1

       int h = a+++b--;         // 1] a+b(5+2)=7, 2] a++ = 6 , 3] b-- = 1
       System.out.println(h);   //7
       System.out.println(a);   //6
       System.out.println(b);   //1

       int i = --a * --b;         //--a (--5)=4 , 2] --b(--2)=1 , 3]4*1 =4
       System.out.println(i);  //4
       System.out.println(a);  //4
       System.out.println(b);  //1

    }
}
