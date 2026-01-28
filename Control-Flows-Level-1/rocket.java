import java.util.Scanner;
class natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of countdown: ");
        int a = sc.nextInt();
		int b= 0;
        if (a>=0){
			while (a>=0){
				System.out.println(+a);
				a--;
			}
        }
		else {
			System.out.println("Please enter a valid Countdown");
        }
    }
}
