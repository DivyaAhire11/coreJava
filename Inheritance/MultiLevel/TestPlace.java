import java.util.Scanner;

class TestPlace{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.print("Enter Number of Places : ");
        n = sc.nextInt();
           
        Continent c[] = new Continent[n];
        for(i=0;i<c.length;i++){
            c[i] = new State();
            c[i].accept();
        }
        System.out.println("STATE\t\tCOUNTRY\t\tCONTINENT");
          for(i=0;i<c.length;i++){
            c[i].display();
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