package operation;

public class Addition{
    private int n1,n2;
    private float n3,n4;

    public Addition(int a,int b,float c,float d){
        n1 = a;
        n2 = b;
        n3 = c;
        n4 = d;
    }
    public int add(){
        return n1+n2;
    }
    public float subtract(){
        return n3-n4;
    }
}