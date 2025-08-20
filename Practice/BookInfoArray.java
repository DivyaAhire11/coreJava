import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;
    int year;

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
        sc.nextLine(); // consume newline

        Book[] books = new Book[n];

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
            sc.nextLine(); // consume newline

            books[i] = new Book(title, author, price, year);
        }

        System.out.println("\n--- Library Books ---");
        System.out.println("Title\t\tAuthor\t\tPrice\t\tYear");
        for (Book b : books) {
            b.display();
        }

        sc.close();
    }
}
