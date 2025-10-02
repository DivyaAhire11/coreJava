// state inherite from country
import java.util.Scanner;

class State extends Country{
    private String State;

    public void accept(){
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter State : ");
        State = sc.next();
    }
    public void display(){
        System.out.print(State+"\t\t");
        super.display();
    }
}