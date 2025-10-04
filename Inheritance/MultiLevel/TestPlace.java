import java.util.Scanner;

class TestPlace{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,i;
        String st,ctry,cnt;
        System.out.print("Enter Number of Places : ");
        n = sc.nextInt();
           
        State s[] = new State[n];
       
        for(i=0;i<s.length;i++){
            System.out.print("Enter Continent : ");
            ctry = sc.next();
            System.out.print("Enter Country : ");
            cnt = sc.next();
            System.out.print("Enter State : ");
            st = sc.next();

            s[i] = new State(ctry,cnt,st);
            // s[i].accept();
        }
        System.out.println("CONTINENT\tCOUNTRY\t\tSTATE");
          for(i=0;i<s.length;i++){
            s[i].display();
        }
       
       
       
        // Country ct = new Country();
        // ct.accept();
        // ct.display();

        // State s = new State();
        // s.accept();
        // s.display();

        // Continent c = new Continent();
        // c.accept();
        // c.display();
    }
}