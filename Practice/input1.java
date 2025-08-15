import java.util.Scanner;

class input1{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);

         String l;
         System.out.print("\nEnter line :");
         l = s.nextLine();
         System.out.println("line is : "+l);

         int x;
         System.out.print("\nEnter integer :");
         x = s.nextInt();
         System.out.println("Integer number is : "+x);

         float f;
         System.out.print("\nEnter float :");
         f = s.nextFloat();
         System.out.println("float nuber is : "+f);

         String str;
         System.out.print("\nEnter string :");
         str = s.next();
         System.out.println("String is : "+str);

        // String blank;
        // blank=s.nextLine();

        //  String l;
        //  System.out.print("\nEnter line :");
        //  l = s.nextLine();
        //  System.out.println("line is : "+l);

         boolean b;
         System.out.print("\nEnter boolean :");
         b = s.nextBoolean();
         System.out.println("Boolean num is : "+b);

         byte y;
         System.out.print("\nEnter byte :");
         y = s.nextByte();
         System.out.println("Byte number is : "+y);
    }
}