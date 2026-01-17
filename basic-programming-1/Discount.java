import java.util.Scanner;
class Discount{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Fee: ");
		int fee= sc.nextInt();
		System.out.print("Enter Discount Percentage: ");
		double b= sc.nextDouble();
		double discount= (b/100)*fee;
		double amount= fee-discount;
		System.out.println("discounted amount is: "+discount);
		System.out.print("amount to be paid: "+amount);
	}
}
	
		