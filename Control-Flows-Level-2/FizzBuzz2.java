import java.util.Scanner;
class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Enter a positive integer only");
        } 
		else {
			int i=n;
            while (i!=1) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz: "+i);
                } else if (i % 3 == 0) {
                    System.out.println("Fizz: "+i);
                } else if (i % 5 == 0) {
                    System.out.println("Buzz: "+i);
                } else {
                    System.out.println(i);
                }
				i--;
            }
        }
    }
}
