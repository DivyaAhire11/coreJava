import java.util.Scanner;

class Square {
    private int a;
    private int area;
    private int perimeter;
    private double diagonal;

    public Square(int a) {
        this.a = a;
    }

    public void area() {
        area = a * a;
    }

    public void perimeter() {
        perimeter = 4 * a;
    }

    public void diagonal() {
        diagonal = a * Math.sqrt(2);
    }

    public void display() {
        System.out.println("Area of Square : " + area);
        System.out.println("Perimeter of Square : " + perimeter);
        System.out.println("Diagonal of Square : " + diagonal);
    }
}

class Triangle {
    private int base;
    private int height;
    private int a;
    private int b;
    private int c;
    private double s;

    private double area;
    private double perimeter;
    private double herons;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        base = sc.nextInt();
        System.out.print("Enter height : ");
        height = sc.nextInt();

        System.out.print("Enter side a : ");
        a = sc.nextInt();
        System.out.print("Enter side b : ");
        b = sc.nextInt();
        System.out.print("Enter side c : ");
        c = sc.nextInt();
    }

    public void area() {
        area = 0.5 * base * height;
    }

    public void perimeter() {
        perimeter = a + b + c;
    }

    public void herons() {
        s = perimeter / 2.0;
        herons = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public void display() {
        System.out.println("Area of Triangle : " + area);
        System.out.println("Perimeter of Triangle : " + perimeter);
        System.out.println("Heron's Formula Area of Triangle : " + herons);
    }
}

class Cube {
    private int a;
    private int SA;
    private int volume;
    private double diagonal;

    public Cube(int a) {
        this.a = a;
    }

    public void surfaceArea() {
        SA = 6 * a * a;
    }

    public void volume() {
        volume = a * a * a;
    }

    public void diagonal() {
        diagonal = a * Math.sqrt(3);
    }

    public void display() {
        System.out.println("Surface Area of Cube : " + SA);
        System.out.println("Volume of Cube : " + volume);
        System.out.println("Diagonal of Cube : " + diagonal);
    }
}

class Cuboid {
    private int l;
    private int b;
    private int h;
    private int SA;
    private int volume;
    private double diagonal;

    public Cuboid(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public void surfaceArea() {
        SA = 2 * (l * b + b * h + h * l);
    }

    public void volume() {
        volume = l * b * h;
    }

    public void diagonal() {
        diagonal = Math.sqrt(l * l + b * b + h * h);
    }

    public void display() {
        System.out.println("Surface Area of Cuboid : " + SA);
        System.out.println("Volume of Cuboid : " + volume);
        System.out.println("Diagonal of Cuboid : " + diagonal);
    }
}

class Cone {
    private int r;
    private int h;
    private double slH;
    private double csa;
    private double tsa;
    private double vol;

    public Cone(int r, int h) {
        this.r = r;
        this.h = h;
        slH = Math.sqrt(r * r + h * h);
    }

    public void csa() {
        csa = Math.PI * r * slH;
    }

    public void tsa() {
        tsa = Math.PI * r * (slH + r);
    }

    public void volume() {
        vol = (1.0 / 3) * Math.PI * r * r * h;
    }

    public void display() {
        System.out.println("Curved Surface Area of Cone : " + csa);
        System.out.println("Total Surface Area of Cone : " + tsa);
        System.out.println("Volume of Cone : " + vol);
    }
}
