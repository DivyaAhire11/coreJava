//Calculate Circumference of circle C = 2*PI*r
//Using OOPS

import java.util.Scanner;
class Circle{
    private float r;
    public float Circumference;

    public Circle(){
        r = 0.0f;
    }
    public Circle(float r){
         this.r = r;  
    }
    public void Calculate(){
        Circumference = 2 * 3.14f * r;
    }
    public void display(){
        System.out.println("Circumference Of Circle is : "+Circumference);
    }
}
class TestCircle{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      float r;
      System.out.print("Enter radius :");
      r = sc.nextFloat();
      Circle ob = new Circle(r);
      ob.Calculate();
      ob.display();
    }
}