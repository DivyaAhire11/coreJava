package SY;

public class SYMarks{
    int ctotal;
    int mtotal;
    int etotal;

    public SYMarks(){}
    public SYMarks(int c,int m,int e){
        ctotal = c;
        mtotal = m;
        etotal = e;
    }
    public int sytotal(){
        return (ctotal+mtotal+etotal);
    }
    public void display(){
        System.out.println("Computer Marks :"+ctotal);
        System.out.println("Mathematic Marks :"+mtotal);
        System.out.println("Electronic Marks :"+etotal);
    }
}