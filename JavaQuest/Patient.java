import java.util.*;

class CovidException extends Exception{
    public String toString(){
        return "Patient is Covid Positive(+) and need to hospitalized";
    }
}
class Patient{
     String patient_name;
     int patient_age;
     int patient_oxy_level;
     int patient_HRCT_report;

     void accept(){
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter Patient Name : ");
        patient_name = sc.next();
         System.out.print("Enter Patient Age : ");
        patient_age = sc.nextInt();
         System.out.print("Enter Patient Oxygen Level : ");
        patient_oxy_level = sc.nextInt();
         System.out.print("Enter Patient HRTC Report : ");
        patient_HRCT_report = sc.nextInt();
        try{
            if(patient_oxy_level < 95 && patient_HRCT_report > 10 ){
                    throw new CovidException();
            }else{
                 System.out.println("\nPATIENT NAME\tPATIENT AGE\tOXYGEN LEVEL\tHRCT REPORT");
                 display();
             }
            }catch(CovidException ce){
            System.out.println(ce);
        }
     }

     void display(){
        System.out.println(patient_name+"\t\t"+patient_age+"\t\t"+patient_oxy_level+"\t\t"+patient_HRCT_report);
     }
}

class TestPatient{
    public static void main(String args[]){
        Patient p = new Patient();
        p.accept();
      
       
    }
}