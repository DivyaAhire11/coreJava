import java.util.*;

class OfficeStaff extends Staff{
     private String dept;

     public OfficeStaff(int id,String nm,String dept){
         super(id,nm);
         this.dept = dept;
     }
     public void display(){
         System.out.println(id+"\t"+name+"\t"+dept);
     }
}