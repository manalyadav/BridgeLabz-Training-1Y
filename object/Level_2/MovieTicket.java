import java.util.Scanner;

class MovieTicket {

    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String name, int seat, double p) {
        movieName = name;
        seatNumber = seat;
        price = p;
        System.out.println("Ticket Booked Successfully!");
    }

    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MovieTicket m = new MovieTicket();

        System.out.print("Enter Movie Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        m.bookTicket(name, seat, price);
        m.displayTicket();
    }
}