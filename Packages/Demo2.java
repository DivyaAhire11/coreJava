package ty;

class BB extends AA{ //inheritance
  public void m1(){
    // System.out.println(balance); //balance has private access in AA
    System.out.println(NoteBook);
    System.out.println(contact);
    System.out.println(name);
  }

}
//javac -d . Demo2.java