import java.util.Scanner;

class CarRental1 {

    private String customerName;
    private String carModel;
    private int rentalDays;
    private int pricePerDay = 1000;

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    void totalCost() {
        int cost = rentalDays * pricePerDay;

        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + cost);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Car Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Rental Days: ");
        int days = sc.nextInt();

        CarRental c = new CarRental(name, model, days);
        c.totalCost();
    }
}