//area = (pi X r X l) + (pi x r x r)
//volume = (1/3)  X PI X r X r X h

class Cone extends Shape{
     double r;
     double l;
     double h;
     
     void area(){
       double a;
       a = (PI * r * l) + (PI * r * r);
       System.out.println("Area of Cone is : "+a);
     }
     void volume(){
       double v;
       v = (1.0/3.0) * PI * r * r *h;
       System.out.println("Area of Cone is : "+v);
     }
}