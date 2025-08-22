//using Parameterized Constructor and display
import java.io.*;

class Info{
   private int FlightNo;
   private String airline;
   private float duration;

   public Info(int FlightNo,String airline,float duration){
        this.FlightNo = FlightNo;
        this.airline = airline;
        this.duration = duration;
   }

   public void display(){
    System.out.println(FlightNo+"\t\t"+airline+"\t\t"+duration);
   }
}

class testInfo{
     public static void main(String []args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
        int fn;
        String al;
        float d;

        // System.out.print("Enter Flight Number :");
        // fn = Integer.parseInt(br.readLine()); 

        // System.out.print("Enter AirLine : ");
        // al = br.readLine(); 

        // System.out.print("Enter Duration : ");
        // d = Float.parseFloat(br.readLine());

        // Info ob1 = new Info(fn,al,d);
        // ob1.display();


         int n,i;
         System.out.print("Enter How many Flights : ");
         n = Integer.parseInt(br.readLine());
         Info[] a = new Info[n];

         for(i=0;i<a.length;i++){
            System.out.print("Enter Flight Number :");
            fn = Integer.parseInt(br.readLine()); 

            System.out.print("Enter AirLine : ");
            al = br.readLine(); 

            System.out.print("Enter Duration : ");
            d = Float.parseFloat(br.readLine());

            a[i] = new Info(fn,al,d);       
            }

        System.out.println("All Info About Fligts Are Follow");
        System.out.println("FLIGHT\t\tAIRLINE\t\tDURATION");
        for(Info t : a){
            t.display();
        }
        }catch(IOException e){ }
     }
}