//area = 4 X pi X r X r
//volume = 4 X PI X r X r X r

class Sphere extends Shape{
    double r;

    Sphere(double r){
        this.r = r;
    }
    void area(){
       double a;
       a = 4 * PI * r * r;
       System.out.println("Area of Sphere is : "+a);
    }
    void volume(){
       double v;
       v = 4 * PI * r * r * r;
       System.out.println("Volume of Sphere is : "+v);
    }
}