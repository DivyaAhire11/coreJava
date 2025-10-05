//area = (2 X pi X r X h) +(2 x pi x r xr)
//volume = PI X r X r X h


class Cylinder extends Shape{
     double r;
     double h;
     
     void area(){
       double a;
       a = (2 * PI * r * h) + (2 * PI * r * r);
       System.out.println("Area of Cylinder is : "+a);
     }
     void volume(){
       double v;
       v = PI * r * r * h;
       System.out.println("Area of Cylinder is : "+v);
     }
}