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
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Flight ob1 = new Flight(); //single object create
        // ob1.accept();
        // ob1.display();      

        // Flight ob2 = new Flight(); 
        // ob2.accept();
        // ob2.display();

        //array of an object
        int n=0,i;
        System.out.print("Enter How many Flights : ");
        try{
        n = Integer.parseInt(br.readLine());
        }catch(IOException e){ }

        Flight[] arr = new Flight[n];
        for(i=0;i<arr.length;i++){
            arr[i] = new Flight();
            System.out.println("\n Enter for "+ (i+1) +" Flight Info");
            arr[i].accept();
        }

        System.out.println("All Info About Fligts Are Follow");
        System.out.println("FLIGHT\t\tAIRLINE\t\tDURATION");
        for(Flight f : arr){
            f.display();
        }
    }
}