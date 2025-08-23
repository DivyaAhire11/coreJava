//Using BufferedReader Accept Input fron User 
//Using parameterized constructor and display method

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// import java.io.*;

class Book{
    private String title;
    private String author;
    private double price;
    private int year;

    public Book(String title,String author,double price,int year){
       this.title=title;
       this.author=author;
       this.price=price;
       this.year=year;
    }
    
    public void display(){
        System.out.println(title+"\t\t"+author+"\t\t"+price+"\t\t"+year);
    }

}
class BookInfo{
    public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
         int i,n,yr;
         String t,a;
         double pr;
         
         System.out.print("Enter How many Books : ");
         n = Integer.parseInt(br.readLine());
         Book[] BK = new Book[n]; //BK is an array Of of Books

         for(i=0;i<BK.length;i++){
            System.out.print("\nEnter Information of BOOK : "+(i+1));
            System.out.print("\nEnter Title : ");
            t = br.readLine();

            System.out.print("Enter Author : ");
            a = br.readLine();

            System.out.print("Enter Price : ");
            pr = Double.parseDouble(br.readLine());

            System.out.print("Enter Year : ");
            yr = Integer.parseInt(br.readLine());

            BK[i] = new Book(t,a,pr,yr);
         }
         System.out.println("\n--- Library Books ---");
         System.out.println("Title\t\tAuthor\t\tPrice\t\tYear");
         for(Book B : BK)
            B.display();

         }catch(IOException ekds){  
            System.out.println("ProBlem Occured, but HAndled");
         }
         
    }
}