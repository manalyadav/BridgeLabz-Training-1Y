import java.util.Scanner;
class rocket2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of countdown: ");
        int n = sc.nextInt();
        if (n>=0){
			for(int i=n; i>=0; i++){
				System.out.println(i);
			}
        }
		else {
			System.out.println("Please enter a valid Countdown");
        }
    }
}
