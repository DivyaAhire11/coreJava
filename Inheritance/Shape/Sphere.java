class Sphere implements Shape{
    double r;

    public void accept(){
        System.out.print("Enter Radius :");
        r = sc.nextDouble();
     }
    public void area(){
       double a;
       a = 4 * PI * r * r;
       System.out.println("Area of Sphere is : "+a);
    }
    public void volume(){
       double v;
       v = 4 * PI * r * r * r;
       System.out.println("Volume of Sphere is : "+v);
    }
}