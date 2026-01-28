import java.util.Scanner;
class factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        double a = sc.nextDouble();
		double total=1.0;
		double i=a;
		while (i!=1.0){
			total*=i;
			i--;
		}
		System.out.println("Factorial is: "+total);
    }
}
