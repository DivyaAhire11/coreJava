class Test{
     public static void main(String a[]){
        System.out.println("Entered Name is: ");
        for(int i=0;i<a.length;i++){
            System.out.println(" "+a[i]);
        }
        String lname;
        lname = a[2];
        String f = lname.substring(0,1);
        f = f.toUpperCase();
        System.out.println("\n Converted Name is:");
        for(int i=0;i<a.length;i++){
            System.out.println(""+a[i]);
        }
        System.out.println(" "+f);
     }
}