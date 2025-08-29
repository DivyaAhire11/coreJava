class Number{
    private int num;
    public Number(int num){
        this.num=num;
    }
    public boolean isPositive(){
        return (num>0);          
    }
    public boolean isNegative(){
        return (num<0);
    }
    public boolean isZero(){
        if(num == 0)
           return true;
        return false;
    }
    public boolean isEven(){
        if(num%2 == 0)
           return true;
        return false;
    }
    public boolean isOdd(){
        if(num%2 != 0)
           return true;
        return false;
    }
}

class testNum{
    public static void main(String args[]){
      
        int len,num;
        boolean ans;
        len = args.length;
        if(len == 1){
            try{
                num = Integer.parseInt(args[0]);
                Number ob = new Number(num);
               
                System.out.println("Number is Positive : "+ ob.isPositive());
                    
                System.out.println("Number is Negative : "+ob.isNegative());

                System.out.println("Number is Zero : "+ob.isZero());
            
                System.out.println("Number is Odd : "+ob.isOdd());
                    
                System.out.println("Number is Even : "+ ob.isEven());
              
            }catch(Exception e){
                System.out.println("Something Happened!");
            }


        }else{
            System.out.println("Give one cmd-line argument");
        }
    }
}