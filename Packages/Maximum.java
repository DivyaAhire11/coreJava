package operation;

public class Maximum{
    private int n1,n2;

    public Maximum(int a,int b){
        n1 = a;
        n2 = b;
    }
    public int max(){
         return (n1 > n2 ? n1 : n2) ;
    }
}