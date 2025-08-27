class Utility{

    public static int factorial(int x){
         int i,fact=1;
         for(i=1;i<=x;i++){
            fact = fact * i; 
         }
         return fact;
    }


    public static int power(int x,int y){
        int ans = 1;
      for(int i =1;i<=y;i++){
         ans = ans * x;
      }
      return ans;
   
     }
}