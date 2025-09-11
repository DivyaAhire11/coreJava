package sy;
import ty.AA;
class EE{
    public void m1(){
    AA ob1 = new AA();
        // System.out.println(ob1.balance);//balance has private access in AA
        // System.out.println(ob1.NoteBook);// NoteBook is not public in AA; cannot be accessed from outside package
        // System.out.println(ob1.contact);// contact has protected access in AA
        System.out.println(ob1.name);
    }
}
//javac -d . Demo5.java