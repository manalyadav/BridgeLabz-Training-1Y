import java.util.Scanner;
class Distribution{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter no. of pens: ");
		int a= sc.nextInt();
		System.out.print("Enter no. of Students: ");
		int b= sc.nextInt();
		int quotient= a/b;
		int rem= a%b;
		System.out.println("quotient: "+quotient);
		System.out.print("Rem: "+rem);
	}
}
	
		