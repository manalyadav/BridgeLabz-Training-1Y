import java.util.Scanner;
class SumOfNaturalNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("The number is not a natural number.");
        } 
		else {
            int sum = 0;
            for (int i=1; i<=n; i++){
				sum+=i;
			}
        int formula = n * (n + 1) / 2;
		System.out.println("Sum using while loop: " +sum);
		System.out.println("Sum using formula: " +formula);
		if (sum == formula) {
			System.out.println("Both results are correct and equal.");
		}
		else {
			System.out.println("Results are not equal.");
		}
        }
    }
}
