import java.util.Scanner;

class Circle1 {

    private double radius;

    Circle() {
        this(1.0);
    }

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        c.display();
    }
}