import java.util.Scanner;

class CovidTest extends Exception{
    String msg;
    CovidTest(String msg){
        this.msg = msg;

    }
    public String toString(){
        return msg;
    }
}

class Covid{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String nm;
        int a,oxylvl,hrct;
        System.out.print("Enter Patient Name :");
        nm = s.next();
        System.out.print("Enter Patient Age :");
        a = s.nextInt();
        System.out.print("Enter Patient Oxyzenlevel :");
        oxylvl = s.nextInt();
        System.out.print("Enter Patient HRCT's Score :");
        hrct = s.nextInt();


        try{
          
          if(oxylvl < 95){
            if(hrct > 10){
                throw new CovidTest("\n patient is Covid Positive(+) and need to Hospitalized");
            }
          }else{
            System.out.println("\nPatient Name : "+nm);
            System.out.println("\nPatient Age : "+a);
            System.out.println("\nPatient Oxyen Level : "+oxylvl);
            System.out.println("\nPatient HRCT Score : "+hrct);

          }

        }catch(CovidTest c){
            System.out.println(c);
        }
    }
}