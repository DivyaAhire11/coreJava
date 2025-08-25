class SUM{
    public static void main(String args[]){
        int n,i,sum=0;
        n = args.length;
        int t[] = new int[n];
        try{
        for(i=0;i<n;i++)
           t[i] = Integer.parseInt(args[i]);

        for(i=0;i<n;i++)
           sum += t[i];

        System.out.println("Total sum is : "+sum);

        }catch(Exception e){
             System.out.println("Something Happened ");
             System.out.println("Please Enter Valid Only");
        }
    }
}