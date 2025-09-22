
class Employee{
    private int id;
    private String name;
    private String dept;
    private float salary;

    public Employee(){}

    public Employee(int id,String name,String dept,float salary){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    public void display(){
        System.out.print(id +"\t\t"+ name +"\t\t"+ dept +"\t\t"+ salary+"\t\t");
    }
    public float getSalary(){
        return salary;
    }
}