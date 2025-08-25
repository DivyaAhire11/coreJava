/*
Problems while INPUT
 1. java Add 7 3 3
First Input is :7
Second Input is :3
Output is :10

2.java Add x 8  
Something Happened :java.lang.NumberFormatException: For input string: "x"

3.java Add 8 a
Something Happened :java.lang.NumberFormatException: For input string: "a"

4.java Add 8  
Something Happened :java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
*/
class Add{
    public static void main(String args[]){
        try{

            int a,b;
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
           
            System.out.println("First Input is :"+a);//4
            System.out.println("Second Input is :"+b);//6
            System.out.println("Output is :"+(a+b)); //10

        }catch(Exception e){
            System.out.println("Something Happened :"+e);
        }
       
              
    }
}