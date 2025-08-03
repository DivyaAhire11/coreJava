//ARRAY OF AN OBJECT
public class Student {
    private int roll;
    private String name;
    private float mks;

    public void setStud(int x, String n , float m){
        roll = x;
        name = n;
        mks = m;
    }

    public void display(){
        System.out.println("ROLL : "+roll);
        System.out.println("NAME : "+name);
        System.out.println("MARKS : "+mks +"%");
    }
}
class Stud{
    public static void main(String[] args) {
       Student s[] = new Student[5];
       for(int i = 0 ; i<s.length ; i++){
          s[i] = new Student(); 
       }
       s[0].setStud(11, "abcd", 90.8f);
       s[1].setStud(22, "pqr", 80.8f);
       s[2].setStud(33, "mnop", 94.60f);
       s[3].setStud(44, "xyz", 70.90f);


       for(Student st : s){
          st.display();
       }
    }
}