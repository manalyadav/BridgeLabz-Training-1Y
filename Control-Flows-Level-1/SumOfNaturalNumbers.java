import java.util.Scanner;
class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("The number is not a natural number.");
        } 
		else {
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum+= i;
                i++;
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
