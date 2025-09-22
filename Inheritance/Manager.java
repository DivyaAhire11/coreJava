import java.util.Scanner;

class Manager extends Employee{
    private float bonus;
    private float total;

    public Manager(){}

    public Manager(int id,String name,String dept,float salary){
        super(id,name,dept,salary);
       
    }
    
    public void accept(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter bonas :");
    bonus = sc.nextFloat();
    total = getSalary() + bonus;
    }
    public void display(){
        super.display();
        System.out.println(this.bonus+"\t\t"+this.total);
    }
   public static int total(Manager[] m){
        int loc=0,i;
        float max = m[0].total ;
        for(i=1;i<m.length;i++){
            if(max < m[i].total)
              {
                 max = m[i].total;
                 loc = i;
              }
        }
        return loc;
    }
}