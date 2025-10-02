import java.util.Scanner;

class TestVehicle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       int n,i;
        System.out.print("Enter Numbers Of Vehicles :");
        n = sc.nextInt();
        Vehicle v[] = new Vehicle[n]; //array of reference
        for(i=0;i<n;i++){
             v[i] = new Vehicle(); //super ref = super obj
             v[i].accept(); 
        }
       for(Vehicle t : v){
         t.display();
         }
         
       
    }
}