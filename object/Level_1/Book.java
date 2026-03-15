import java.util.Scanner;

class Book {

    private String title;
    private String author;
    private double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Title: ");
        String t = sc.nextLine();

        System.out.print("Enter Author: ");
        String a = sc.nextLine();

        System.out.print("Enter Price: ");
        double p = sc.nextDouble();

        Book b = new Book(t, a, p);
        b.display();
    }
}