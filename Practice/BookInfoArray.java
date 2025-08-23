//Using Scanner Accept Input fron User 
//Using parameterized constructor and display method

import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;
    private int year;

    public Book(String title, String author, double price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    public void display() {
        System.out.println( title + "\t\t" + author + "\t\t" + price + "\t\t " + year);
    }
}

public class BookInfoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
    
        Book[] books = new Book[n];//books array 

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author: ");
            String author = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Year: ");
            int year = sc.nextInt();
          
            books[i] = new Book(title, author, price, year);
        }

        System.out.println("\n--- Library Books ---");
        System.out.println("Title\t\tAuthor\t\tPrice\t\tYear");
        for (Book b : books) {
            b.display();
        }

      
    }
}
