class Box implements Shape{
     double l;
     double b;
     double h;
  
     public void accept(){
        System.out.print("Enter Slant height :");
        l = sc.nextDouble();
        System.out.print("Enter Breath :");
        b = sc.nextDouble();
         System.out.print("Enter Height :");
        h = sc.nextDouble();
     }

    public void area(){
       double a;
       a = 2 * ( l*b + b*h + l*h);
       System.out.println("Area of Box is : "+a);
     }
    public void volume(){
       double v;
       v = l * b * h;
       System.out.println("Area of Box is : "+v);
     }
}