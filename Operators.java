// 1. logical operator
// 2. arithmetic operator
// 3. relational operator
// 4. bitwise operator
// 5. assignment operator
// 6. ternary operator
// 7. increment decrement operator


 //ARITHMETIC OPERATOR
//  class operator1{
//      public static void main(String ajhd[]){
//          int a = 5;
//          int b = 94;
//          System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
//          System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));           
//          System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));           
//          System.out.println("Division of "+a+" and "+b+" is "+(b/a));           
//          System.out.println("Modulo of "+a+" and "+b+" is "+(b%a));           

//       short x= 5;
//       short y = 10;
//       short z = (short)x*y;   // return int 
//       System.out.println("multiplication of short num is :"+z);

//       String name1 = "Hello ";
//       String name2 = "Divya";
//       System.out.println("Concatination of Strings :" + (name1+name2));


//       int m = 3;
//       int n = 2;
//       System.out.println("total is : "+m+n);  //total is : 32(concatinate)

//       int num = 10;
//       System.out.println("Division is :"+(num/0));  // abort program (runtime error)

//      }
//  }


 class operator2{
    public static void main(String []args){
       //RELATIONAL OPERATOR(return boolean value) 
         // int A = 10;
         // int B = 23;
        // boolean C = A > B;
        // System.out.println("result is :"+C);


        //LOGICAL OPERATOR
          int x = 5;
          int y = 2;
        //   boolean z = ( x > y ) && ( x != y );  // 5 > 2 && 5 != 2 => true  && true => true
        //   System.out.println("result is :"+z); // true
        
        //   System.out.println(x > y && ++x < y); // 5 > 2 && 6 < 2 => true && false => false
        //    //x = 6, y = 2
        //   System.out.println(x > y && x < y++); // 6>2 && 6 < 2 => true && false =>false
        //    //x = 6, y = 3
        //   System.out.println(x < y && x < --y);// 6 < 3 =>false (second condion not check)
        //   System.out.println(x != y && x-- > y); // 6 != 3 && 6>3 =>true && true => true
        //    //x = 5, y = 3
        //   System.out.println(x == y && x-- > --y); // 5 == 2 => false(second condition not check)
 
        
          System.out.println(x == y || ++x < 3); // false
          System.out.println(x); //6

          System.out.println(x != y || ++x < 3); //true
          System.out.println(x); //6
    }
 }



