
class TestShape{
    public static void main(String[] args){
        Shape s = null;
        s = new Sphere();
        s.accept();
        s.area();
        s.volume();

        s = new Cylinder();
        s.accept();
        s.area();
        s.volume();

        s = new Cone();
        s.accept();
        s.area();
        s.volume();

        s = new Box();
        s.accept();
        s.area();
        s.volume();
    }
}