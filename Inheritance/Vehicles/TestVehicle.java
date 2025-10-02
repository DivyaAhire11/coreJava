import java.util.Scanner;

class TestVehicle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.print("Enter Numbers Of Vehicles :");
        n = sc.nextInt();
        Vehicle v[] = new Vehicle[n];
        for(i=0;i<v.length;i++){
               v[i].accept(); 
        }
        for(i=0;i<v.length;i++){
               v[i].display();
        }
     
    }
}