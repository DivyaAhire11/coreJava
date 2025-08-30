//Perimeter of Rectangle : P = 2(l + b)
//Area of Rectangle : A = l * b
//Diagonal of Rectangle : D = sqrt(l*l + b*b)
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Rectangle{
     private float length;
     private float breath;
     private float Perimeter;
     private float Area;
     private double Diagonal;

     public Rectangle(float l,float b){
        length = l;
        breath = b;
     }
     public void calcPerimeter(){
          Perimeter = 2 * (length + breath);
     }
     public void calcArea(){
        Area = length * breath;
     }
     public void calcDiagonal(){
        Diagonal = Math.sqrt((length*length) + (breath*breath));
     }
     public void display(){
        System.out.println("Area of Rectangle is : "+Area);
        System.out.println("Perimeter of Rectangle is : "+Perimeter);
        System.out.println("Diagonal of Rectangle is : "+Diagonal);
     }

}
class TestRectangle{
    public static void main(String args[]){
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      float l,b;
      try{
      System.out.print("Enter Length :");
      l = Float.parseFloat(br.readLine());
       System.out.print("Enter Breath :");
      b = Float.parseFloat(br.readLine());
     
      Rectangle r = new Rectangle(l,b);
      r.calcArea();
      r.calcPerimeter();
      r.calcDiagonal();
      r.display();

      }catch(Exception e){

        System.out.println("Something happened!");

      }
    }
}