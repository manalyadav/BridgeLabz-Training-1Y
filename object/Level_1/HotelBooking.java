import java.util.Scanner;

class HotelBooking {

    private String guestName;
    private String roomType;
    private int nights;

    HotelBooking() {}

    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Guest Name: ");
        String g = sc.nextLine();

        System.out.print("Enter Room Type: ");
        String r = sc.nextLine();

        System.out.print("Enter Nights: ");
        int n = sc.nextInt();

        HotelBooking h = new HotelBooking(g, r, n);
        h.display();
    }
}