import java.util.Scanner;
class Discount{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Height(in cm): ");
		int hc= sc.nextInt();
		double hf= hc*(1.0/30.0);
		double hi= hc*(12.0/30.0);
		System.out.print("your height in cm is: "+hc);
		System.out.print(", your height in foot is: "+hf);
		System.out.print(" and your height in inches is: "+hi);
	}
}
	
		