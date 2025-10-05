// vol = l*b*h
// A = 2(lb + bh + lh)


class Box extends Shape{
     double l;
     double b;
     double h;
     
     void area(){
       double a;
       a = 2 * ( l*b + b*h + l*h);
       System.out.println("Area of Box is : "+a);
     }
     void volume(){
       double v;
       v = l * b * h;
       System.out.println("Area of Box is : "+v);
     }
}