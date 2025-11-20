import java.io.Console;

public class Question2 {
    public static void main(String[] args) {
        Console console = System.console();
        if(console == null){
            System.out.println("No Console : non-interactive mode!");
            System.exit(0);
        }
        System.out.println("Enter Your Username : ");
        String userName = console.readLine();

        System.out.println("UserName : "+userName);
    }
}
