import java.util.Scanner;
class EmployeeBonus {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee salary: ");
		double a = sc.nextDouble();
		System.out.print("Enter years of service: ");
		int b = sc.nextInt();
		double bonus = 0;
		if (b > 5) {
			bonus = a*0.05;
			System.out.println("Bonus amount: " +bonus);
		} 
		else {
			System.out.println("No bonus, Service should be more than 5 years.");
		}
	}
}

