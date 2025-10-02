import java.io.*;

class Vehicle{
    private String company;
    private float price;

    public void accept(){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         try{
           System.out.print("Enter Company Name : ");
           company = br.readLine();
           System.out.print("Enter Price : ");
           price = Float.parseFloat(br.readLine());

         }catch(IOException e){
            System.out.print(e);
         }
    }
    public void display(){
        System.out.print(company+"\t\t"+price+"\t\t");
    }
}