import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number-1 (smaller): ");
        double n1 = sc.nextDouble();
        System.out.print("Enter number-2 (greater): ");
        double n2 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        for (int i = 1; i <= 1; i++) {
            switch (op) {
                case '+':
                    System.out.println("Addition is: " + (n1 + n2));
                    break;
                case '-':
                    System.out.println("Subtraction is: " + (n2 - n1));
                    break;
                case '*':
                    System.out.println("Multiplication is: " + (n1 * n2));
                    break;
                case '/':
                    System.out.println("Division is: " + (n2 / n1));
                    break;
                default:
                    System.out.println("Invalid Operator");
            }
        }
    }
}
