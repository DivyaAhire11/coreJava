// state inherite from country
import java.util.Scanner;

class State extends Country{
    private String state;

    public State(String ctnt,String ctry ,String st){
        super(ctnt,ctry);
        this.state = st;
    }
    public void accept(){
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter State : ");
        state = sc.next();
    }
    public void display(){
        super.display();
        System.out.println(state);
    }
}