class ABC{
  ABC(){
    System.out.println("I am a Constructor");
  }
  public void m1(){
    System.out.println("m1() method");
  }

}
 class testABC{
    public static void main(String args[]){
        ABC ob = new ABC(); 
        ob.m1();
                
      }
     
 }
