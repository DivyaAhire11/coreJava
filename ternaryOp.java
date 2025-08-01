
// TERNARY OPERATOR
class operator3{
    public static void main(String args[]){
        int a = 5;
        int b = 2;
        int c = (a>b)? a : b;
        System.out.println("max is :"+c);

        int p = 43;
        int q = 93;
        int r = 23;
        int res;
        res = ( p>q ) ? ( p>r ? p : r ) : ( q>r ? q : r );
        System.out.println("result is :"+res);

    }
}