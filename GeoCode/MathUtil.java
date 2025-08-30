import java.util.Scanner;
class static Square{
     private int a;
     private int area;
     private int perimeter;
     private float diagonal;

     public Square(int a){
        this.a = a;
     }
     public void area(){
        area = a * a;
     }
     public void Perimeter(){
        perimeter = 4 * a;
     }
     public void diagonal(){
        diagonal = a * Math.sqrt(2);
     }
     public void display(){
        System.out.println("Area of Square :"+Area);
        System.out.println("Perimeter of Square :"+perimeter);
        System.out.println("Diagonal of Square :"+diagonal);

     }

   
}

class static Triangle{
     private int base;
     private int height;
     private int a;
     private int b;
     private int c;
     private float s;

     private float area;
     private float perimeter;
     private float herons;

     public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base :");
        base = sc.nextInt();
        System.out.print("Enter Height :");
        height = sc.nextInt();
        

        System.out.print("Enter side a :");
        a = sc.nextInt();
        System.out.print("Enter side b :");
        b = sc.nextInt();
        System.out.print("Enter side c :");
        c = sc.nextInt();


     }
     public void area(){
        area = (1/2) * breath * height;
     }
     public void Perimeter(){
        perimeter = a + b + c;
     }
     public void Herons(){
        s = perimeter / 2.0;
        herons = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
     }
     public void display(){
        System.out.println("Area of Triangle :"+Area);
        System.out.println("Perimeter of Triangle :"+perimeter);
        System.out.println("herons of Triangle :"+herons);

     }

   
}

class static Cube(){
     private int a;
     private int SA;
     private int volume;
     private float diagonal;

     public Cube(int a){
        this.a = a;
     }
     public void surfaceArea(){
        SA = 6* a * a;
     }
     public void volume(){
        volume = a * a * a;
     }
     public void diagonal(){
        diagonal = a * Math.sqrt(3);
     }
     public void display(){
        System.out.println("Area of Square :"+SA);
        System.out.println("Perimeter of Square :"+volume);
        System.out.println("Diagonal of Square :"+diagonal);
     }
}

class static Cuboid(){
    private int l;
    private int b;
    private int h;
    private int SA;
    private int volume;
    private float diagonal;

    public Cuboid(int l,int b,int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
      public void surfaceArea(){
        SA = 2* (l*b + b*h + h*l)
     }
     public void volume(){
        volume = l*b*h;
     }
     public void diagonal(){
        diagonal = Math.sqrt(l*l + b*b + h*h);
     }
     public void display(){
        System.out.println("Area of Square :"+SA);
        System.out.println("Perimeter of Square :"+volume);
        System.out.println("Diagonal of Square :"+diagonal);
     }
}