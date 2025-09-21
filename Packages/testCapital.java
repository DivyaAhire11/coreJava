import utility.CapitalString;
import java.util.Scanner;
class Capital{
      public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String name,city,x[];
        int i,n; 
        CapitalString cs = new CapitalString();

        // System.out.print("Enter Your Full Name : ");
        // name = s.nextLine();  
       
        // System.out.print("Enter City Name : ");
        // city = s.nextLine();
        System.out.print("Enter Who many person :");
        n = s.nextInt();
        Person pr[] = new Person[n]; //person
        for(i=0;i<pr.length;i++){
          System.out.print("Enter Your Full Name : ");
          name = s.nextLine();  
          System.out.print("Enter City Name : ");
          city = s.nextLine();
         
         
           pr[i] =  new person(name,city);
        }
      //   for(i=0;i<pr.length;i++){
      //   String[] x = 
      //  }
        pr[i].name = cs.Capitalized(name);

        // Person p = new Person(name,city);
        p.display(x);
    }
} 