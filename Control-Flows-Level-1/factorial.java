import java.util.Scanner;
class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        double a = sc.nextDouble();
		double total=1.0;
		for(int i=1; i<=a; i++){
			total*=i;
		}
		System.out.println("Factorial is: "+total);
    }
}
