import java.util.Scanner;

class InvalidAgeInput extends Exception{
     int age;
    InvalidAgeInput(int a){
       age = a; 
    }
    
    public String toString(){
        return "Invalid Age Input : "+age;
    }
}

class Person{
    private int age;
   
    void accept(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Age : ");
       age = sc.nextInt();
       try{
            if(age < 0 || age >= 90){
               throw new InvalidAgeInput(age);
            }else{
               display();
            }
       }catch(InvalidAgeInput ia){
           System.out.println(ia);
       }
    }
    void display(){
        System.out.print("Age : "+age);
    }
}
class TestPerson{
    public static void main(String args[]){
       Person p = new Person();
       p.accept();

    }
}