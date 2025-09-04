
import java.util.*;

class Shapes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ch,a,r,h;
        System.out.println("** Geometry Formulas Collection **");
        System.out.println("1 . Square ");
        System.out.println("2 . Triangle");
        System.out.println("3 . Cube");
        System.out.println("4 . Cuboid");
        System.out.println("5 . Cone");
        System.out.println("-----------------------------");

        System.out.print("\n Enter Your Choice : ");
        ch = sc.nextInt();
        switch(ch){
            case 1 : 
                    System.out.print("Enter Area of Square :");
                    a = sc.nextInt();
                    Square s = new Square(a);
                    s.area();
                    s.perimeter();
                    s.diagonal();
                    s.display();
                    break;
            case 2 :
                    Triangle t = new Triangle();
                    t.accept();
                    t.area();
                    t.perimeter();
                    t.herons();
                    t.display();
                    break;
            case 3 : 
                    System.out.print("Enter Area of Cube :");
                    a = sc.nextInt();
                    Cube c = new Cube(a);
                    c.surfaceArea();
                    c.volume();
                    c.diagonal();
                    c.display();
                    break;
             case 4 : 
                    Cuboid d = new Cuboid();
                    d.accept();
                    d.surfaceArea();
                    d.volume();
                    d.diagonal();
                    d.display();
                    break;
             case 5 : 
                    System.out.print("Enter Radius :");
                    r = sc.nextInt();
                    System.out.print("Enter Height :");
                    h = sc.nextInt();
                   
                    Cone n = new Cone(r,h);
                    n.csa();
                    n.tsa();
                    n.volume();
                    n.display();
                    break;
            default : System.out.println("Invalid Choice!");
        }
      

    }
}