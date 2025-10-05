class Cylinder implements Shape{
     double r;
     double h;

     public void accept(){
        System.out.print("Enter Radius :");
        r = sc.nextDouble();
        System.out.print("Enter Height :");
        h = sc.nextDouble();
     }

    public void area(){
       double a;
       a = (2 * PI * r * h) + (2 * PI * r * r);
       System.out.println("Area of Cylinder is : "+a);
     }
    public void volume(){
       double v;
       v = PI * r * r * h;
       System.out.println("Area of Cylinder is : "+v);
     }
}