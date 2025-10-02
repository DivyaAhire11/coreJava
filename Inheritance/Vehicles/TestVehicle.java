import java.util.Scanner;

class TestVehicle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,i=0;
        String ch,cmp;
        float p,m,c;
        System.out.print("Enter Numbers Of Vehicles :");
        n = sc.nextInt();

         Vehicle v [] = new Vehicle[n];
       
         while(true){
            
              System.out.print("Enter Company :");
              cmp = sc.next();
              System.out.print("Enter Price : ");
              p = sc.nextFloat();
              System.out.print("Which Type of Vehicle(lmv/hmv) : ");
              ch = sc.next();
            if(ch.equalsIgnoreCase("lmv")){
                System.out.print("Enter Mileage :");
                m = sc.nextFloat();
                v[i] = new LMV(cmp,p,m);
                // v[i].accept();
                i++;
                n--;
            }else if(ch.equalsIgnoreCase("hmv")){
                 System.out.print("Enter Capacity-in-tons :");
                 c = sc.nextFloat();
                v[i] = new HMV(cmp,p,c);
                // v[i].accept();
                i++;
                n--;
            }else{
                System.out.println("Invalid Choice");
            }
      
            if(n==0)
              break;

            }
            
            System.out.println("\nCOMPANY\t\tPRICE\t\tCAPACITY/MILEAGE");
            for(Vehicle vv : v){
                vv.display();
            }
      
      
            System.out.println("\n----------ONLY LMV DATA-------");
            for(i=0;i<v.length;i++){
            if(v[i] instanceof LMV){
                v[i].display();
             }
            }
      
            System.out.println("\n-----------ONLY HMV DATA----------");
            for(i=0;i<v.length;i++){
            if(v[i] instanceof HMV){
                v[i].display();
             }
            }
      
      
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