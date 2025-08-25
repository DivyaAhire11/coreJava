class Add{
    public static void main(String args[]){
      
        if(args.length == 2){  
            try{
                int a,b;
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            
                System.out.println("First Input is :"+a);//4
                System.out.println("Second Input is :"+b);//6
                System.out.println("Output is :"+(a+b)); //10

            }catch(Exception e){
                System.out.println("Something Happened :"+e);
                System.out.println("Please Enter Valid Only");
            }

        }else{
            System.out.println("Invalid Arguments");
     }
              
    }
}