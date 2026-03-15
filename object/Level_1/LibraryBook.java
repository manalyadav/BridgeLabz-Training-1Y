import java.util.Scanner;

class LibraryBook {

    private String title;
    private String author;
    private double price;
    private boolean available;

    LibraryBook(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Book Not Available");
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Title: ");
        String t = sc.nextLine();

        System.out.print("Enter Author: ");
        String a = sc.nextLine();

        System.out.print("Enter Price: ");
        double p = sc.nextDouble();

        LibraryBook b = new LibraryBook(t, a, p);

        b.borrowBook();
        b.display();
    }
}