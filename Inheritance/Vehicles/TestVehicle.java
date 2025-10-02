import java.util.Scanner;

class TestVehicle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.print("Enter Numbers Of Vehicles :");
        n = sc.nextInt();
       
       /* ONLT ACCEPTING VEHICLE INFO
        Vehicle v[] = new Vehicle[n]; //array of reference
        for(i=0;i<n;i++){
             v[i] = new Vehicle(); //super ref = super obj
             v[i].accept(); 
        }
        System.out.println("COMPANY\t\tPRICE");
        for(Vehicle t : v){
         t.display();
         }
        */ 

        /* ONLY ACCEPTING LMV INFO
        LMV l[] = new LMV[n];
        for(i =0;i<n;i++){
            l[i] = new LMV();
            l[i].accept();
            
        }
        System.out.println("COMPANY\t\tPRICE\t\tMILEAGE");
        for(LMV lmv : l)
           lmv.display();
       */

         // ONLY ACCEPTING HMV INFO
       /* HMV h[] = new HMV[n];
        for(i =0;i<n;i++){
            h[i] = new HMV();
            h[i].accept();
            
        }
        System.out.println("COMPANY\t\tPRICE\t\tCAPACITY");
        for(HMV hmv : h)
           hmv.display();
       */

      
    }
}