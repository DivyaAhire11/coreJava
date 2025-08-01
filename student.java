 class  Student {
    private int rollNo;
    private String name;
    private float mks;

    public void setInfo(int r, String n, float m) {
        rollNo = r;
        name = n;
        mks = m;
    }

    public void getInfo() {
        System.out.println("RollNo : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + mks + "%");
    }
}

class employee {
    private int id;
    private float sal;

    public void m1(int x, float y) {
        id = x;
        sal = y;
    }

    public void m2() {
        System.out.println("id : " + id);
        System.out.println("sal : " + sal);
    }
}

class Teststud {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        // ob.rollNo=111; //error bcs (private can't access)

        st1.setInfo(111, "Naman", 94.60f);
        st2.setInfo(222, "Sayali", 80f);
        st3.setInfo(333, "Ritu", 89.80f);

        st1.getInfo();
        st2.getInfo();
        st3.getInfo();

        // EMPLOYEE
        employee e1 = new employee();
        employee e2 = new employee();
        employee e3 = new employee();

        e1.m1(1, 4383.92f);
        e2.m1(2, 2346.3f);
        e3.m1(3, 3702.84f);

        e1.m2();
        e2.m2();
        e3.m2();
    }
}
