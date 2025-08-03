public class employee {
    private int id;
    private String name;
    private static String company;

    public void setEmp(int a,String b){
         id = a;
         name = b;
    }
    public static void initial(String x){
        company = x;
    }
    public void display(){
        System.out.println("ID : "+id);
        System.out.println("NAME : "+name);
        System.out.println("COMPANY : "+company); //common in both data
    }
}
class TestEmployee{
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setEmp(34, "payal");

        employee e2 = new employee();
        e2.setEmp(65, "divya");

         employee.initial("Infosys");

         e1.display();
         e2.display();

          employee.initial("MicroSoft");

         e1.display();
         e2.display();
    }
}