//Area of Circle PI*r*r
//Using OOPs Concept
import java.util.Scanner;

class Circle{
    private float r;
    public float area;

    public Circle(){
        r = 0.0f;
    }
    public Circle(float r){
         this.r = r;  
    }
    public void Calculate(){
        area = 3.14f * r * r;
    }
    public void display(){
        System.out.println("Area Of Circle is : "+area);
    }
}
class TestCircle{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         float r;
         System.out.print("Enter radius : ");
         r = sc.nextFloat();
         Circle c = new Circle(r);
         c.Calculate();
         c.display();
    }
}