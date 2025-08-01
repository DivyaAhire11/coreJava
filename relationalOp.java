


class operator2{
    public static void main(String []args){
       
         int A = 10;
         int B = 23;
        boolean C = A > B;
        System.out.println("result is :"+C);


        //LOGICAL OPERATOR
       
       
          int x = 5;
          int y = 2;
          boolean z = ( x > y ) && ( x != y );  // 5 > 2 && 5 != 2 => true  && true => true
          System.out.println("result is :"+z); // true
        
          System.out.println(x > y && ++x < y); // 5 > 2 && 6 < 2 => true && false => false
           //x = 6, y = 2
          System.out.println(x > y && x < y++); // 6>2 && 6 < 2 => true && false =>false
           //x = 6, y = 3
          System.out.println(x < y && x < --y);// 6 < 3 =>false (second condion not check)
          System.out.println(x != y && x-- > y); // 6 != 3 && 6>3 =>true && true => true
           //x = 5, y = 3
          System.out.println(x == y && x-- > --y); // 5 == 2 => false(second condition not check)
 
        
          System.out.println(x == y || ++x < 3); // false
          System.out.println(x); //6

          System.out.println(x != y || ++x < 3); //true
          System.out.println(x); //6
    }
 }



