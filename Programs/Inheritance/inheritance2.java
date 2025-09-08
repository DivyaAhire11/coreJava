import java.util.Scanner;

class Product implements Cloneable{
      static int cnt =0;
      int id;
      String name;
      double cost;
      int qty;
      Product(){}

      public Product(int pid,String pname,double pcost,int pqty){
        cnt++;
        this.id = pid;
        this.name = pname;
        this.cost = pcost;
        this.qty = pqty;
      }

      public void display(){
        System.out.println(id +"\t\t"+ name +"\t\t"+ cost +"\t\t"+ qty);
        // System.out.println("Product ID : "+id);
        // System.out.println("Product NAME : "+name);
        // System.out.println("Product COST : "+cost);
        // System.out.println("Product QUNTITY : "+qty);
      }

      static void count(){
          System.out.println("Object "+cnt+" is Created");
      }
    public static void main(String args[])throws CloneNotSupportedException{
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter How many Objects :");
         int n = sc.nextInt();
         int pid,pqty,i;
         String pname;
         double pcost;

         Product p[] = new Product[n];
         for(i=0;i<p.length;i++){
            System.out.print("Enter ID :");
            pid = sc.nextInt();
             System.out.print("Enter NAME :");
            pname = sc.next();
             System.out.print("Enter COST :");
            pcost = sc.nextDouble();
             System.out.print("Enter QUNTITY :");
            pqty = sc.nextInt();


            p[i] = new Product(pid,pname,pcost,pqty);
            Product.count();
         }

         System.out.println("\n---------PRODUCT DETAILS-------");
         System.out.println("\nProduct ID \t Product NAME \t Product COST \t Product QUNTITY");
         for(i=0;i<n;i++){
            Product ob = (Product)p[i].clone();

            ob.display();
         }
    }
}