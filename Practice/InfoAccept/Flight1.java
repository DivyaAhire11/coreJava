//using accept() and display()
import java.io.*;

class Flight{
   private int FlightNo;
   private String airline;
   private float duration;

   public void accept(){
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try{

        System.out.print("Enter Flight Number :");
        FlightNo = Integer.parseInt(b.readLine());

        System.out.print("Enter AirLine : ");
        airline = b.readLine();

        System.out.print("Enter Duration : ");
        duration = Float.parseFloat(b.readLine());

         }catch(IOException e){  }
        

   }
   public void display(){
         System.out.println(FlightNo +"\t\t"+airline+"\t\t"+duration);
   }
}
class testFlight{
    public static void main(String []hdc){
       
        // Flight ob1 = new Flight(); //single object create
        // ob1.accept();
        // ob1.display();      

        // Flight ob2 = new Flight(); 
        // ob2.accept();
        // ob2.display();

       
        
    }
}