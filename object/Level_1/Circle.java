import java.util.Scanner;

class Circle {

    double radius;

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        System.out.print("Enter Radius: ");
        c.radius = sc.nextDouble();

        c.calculateArea();
        c.calculateCircumference();
    }
}