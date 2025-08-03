class student {
  private String name;
  private float mks;
  private int roll;

  student(){}
  student(String n){
    name = n;
  }
  student(int x,float y){
    roll = x;
    mks = y;
  }
  student(int x,float y , String z){
    name = z;
    roll = x;
    mks = y;
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
     student ob1 = new student("srk");
     student ob2 = new student(72,83.83f);
     student ob3 = new student(72,38.39f,"pinki");
  
    ob.display();
    ob1.display();
    ob2.display();
    ob3.display();
    
  }
  }