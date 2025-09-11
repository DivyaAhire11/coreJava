package sy;
import ty.AA;

class DD extends AA{
     public void m1(){
        // System.out.println(balance);//balance has private access in AA
        // System.out.println(NoteBook);// NoteBook is not public in AA; cannot be accessed from outside package
        System.out.println(contact);
        System.out.println(name);
    }
}
//javac -d . Demo4.java