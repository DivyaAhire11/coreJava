import java.util.*;

class MyProduct{
    public static void main(String args[]){
       int i=0,ch=1;
       int id,qty;
       String name;
       float cost;
       
       Scanner sc  = new Scanner(System.in);
       Product pd[] = new Product[50];
       do{
          System.out.print("Enter Product ID : ");
          id = sc.nextInt();
          System.out.print("Enter Product Name : ");
          name = sc.next();
          System.out.print("Enter Product Cost : ");
          cost = sc.nextFloat();
          System.out.print("Enter Product Quantity : ");
          qty = sc.nextInt();
        
          pd[i] = new Product(id,name,cost,qty);
          i++;

          Product.show();

          System.out.print("\nDo you Want to continue : 1:yes  0:no : ");
          ch = sc.nextInt();

       }while(ch != 0);

    System.out.println("ID\t\tNAME\t\tCOST\t\tQUANTITY");
       for(Product p : pd){
           p.display();
       }
    }
}