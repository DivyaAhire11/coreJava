class Employee {
    private int id;
    private String name;
    private double salary;

    Employee(int x, double y, String z) {
        id = x;
        salary = y;
        name = z;
    }

    Employee(Employee emp) {
        id = emp.id;
        name = emp.name;
        salary = emp.salary;
    }

    public void display() {
        System.out.println("ID : " + id);
        System.out.println("NAME : " + name);
        System.out.println("SALARY : " + salary);
    }
}

class testEmp {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, 20000, "priya");
        e1.display();

        Employee e2 = new Employee(e1);// passing object as a parameter
        e2.display();

        Employee e3 = new Employee(e1);// passing object as a parameter
        e3.display();
    }
}