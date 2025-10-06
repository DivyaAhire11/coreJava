 
interface MSG{

}

class Product implements MSG{
   private int id;
   private String name;
   private float cost;
   private int quantity;

   public static int cnt;

    public Product(){}

    public Product(int id,String nm,float cst,int qty){
        this.id = id;
        this.name = nm;
        this.cost = cst;
        this.quantity = qty;

        cnt++;
    }

    public static void show(){
        System.out.println("\n Number of Product is "+cnt);
    }

    public void display(){
        System.out.println(id +"\t\t"+ name +"\t\t"+ cost +"\t\t"+ quantity);
    }
}