package ty;

class CC{
    public void m1(){
        AA ob = new AA();
        // System.out.println(ob.balance);//balance has private access in AA
        System.out.println(ob.NoteBook);
        System.out.println(ob.contact);
        System.out.println(ob.name);
    }
   

}
//javac -d . Demo3.java