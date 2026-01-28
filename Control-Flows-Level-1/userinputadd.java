import java.util.Scanner;
class userinputadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        double a = sc.nextDouble();
		double total=0.0;
		while (a!=0){
			total+=a;
			a = sc.nextDouble();
		}
		System.out.println("Sum is: "+total);
    }
}
