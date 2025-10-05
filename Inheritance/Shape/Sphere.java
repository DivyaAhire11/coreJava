//area = 4 X pi X r X r
//volume = 4 X PI X r X r X r

class Sphere extends Shape{
    double r;

    public void accept(){
        System.out.print("Enter Radius :");
        r = sc.nextInt();
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