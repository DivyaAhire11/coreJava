class TestShape{
    public static void main(String[] args){
        Shape s = null;
        System.out.println("\n------- SPHERE -------");
        s = new Sphere();
        s.accept();
        s.area();
        s.volume();

        System.out.println("\n------- CYLINDER -------");
        s = new Cylinder();
        s.accept();
        s.area();
        s.volume();

        System.out.println("\n------- CONE -------");
        s = new Cone();
        s.accept();
        s.area();
        s.volume();

        System.out.println("\n------- BOX -------");
        s = new Box();
        s.accept();
        s.area();
        s.volume();
    }
}