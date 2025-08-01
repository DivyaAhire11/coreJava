class student {
  private String name;
  private float mks;
  private int roll;

  student(){
    name = "hello";
    roll = 50;
    mks = 35.50f;
  }

  public void display(){
    System.out.println(name); 
    System.out.println(mks); 
    System.out.println(roll);
  }
}
class testStudent{
  public static void main(String[] args) {
     student ob = new student();
     ob.display();
  }
}