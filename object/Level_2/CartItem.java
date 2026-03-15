import java.util.Scanner;

class CartItem {

    String itemName;
    double price;
    int quantity;

    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
        System.out.println("Item Added to Cart!");
    }

    void removeItem() {
        itemName = "";
        price = 0;
        quantity = 0;
        System.out.println("Item Removed from Cart!");
    }

    void displayTotal() {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CartItem c = new CartItem();

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        c.addItem(name, price, quantity);

        c.displayTotal();

        System.out.print("Do you want to remove item? (yes/no): ");
        sc.nextLine();
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            c.removeItem();
        }
    }
}