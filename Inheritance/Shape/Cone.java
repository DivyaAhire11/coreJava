class Cone implements Shape{
     double r;
     double l;
     double h;
     
    
    public void accept(){
        System.out.print("Enter Radius :");
        r = sc.nextDouble();
        System.out.print("Enter Slant height :");
        l = sc.nextDouble();
        System.out.print("Enter Height :");
        h = sc.nextDouble();
     }

    public void area(){
       double a;
       a = (PI * r * l) + (PI * r * r);
       System.out.println("Area of Cone is : "+a);
     }
    public  void volume(){
       double v;
       v = (1.0/3.0) * PI * r * r *h;
       System.out.println("Area of Cone is : "+v);
     }
}