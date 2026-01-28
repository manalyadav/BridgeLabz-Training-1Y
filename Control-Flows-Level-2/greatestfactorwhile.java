import java.util.Scanner;
class greatestfactorwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int gf = 1;
		int i=n-1;
        while (i >= 1) {
			if (n % i == 0) {
                gf = i;
                break;
			}
			i--;
        }
        System.out.println(gf);
    }
}
