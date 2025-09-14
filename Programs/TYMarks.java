package ty;

public class TYMarks{
    int theory;
    int practical;
    public TYMarks(){}

    public TYMarks(int t,int p){
        theory = t;
        practical = p;
    }
    public int tytotal(){
        return (theory+practical);
    }
    public void display(){
        // System.out.println("Theory marks :"+theory);
        // System.out.println("Practical marks :"+practical);
        System.out.println(theory+"\t\t"+practical);
    }
}