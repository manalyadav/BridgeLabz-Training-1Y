import java.util.Scanner;
class HeightAndAge{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Age of A1: ");
		int A1= sc.nextInt();
		System.out.print("Enter Age of A2: ");
		int A2= sc.nextInt();
		System.out.print("Enter Age of A3: ");
		int H2= sc.nextInt();
		System.out.print("Enter Height of A1: ");
		int H1= sc.nextInt();
		System.out.print("Enter Height of A2: ");
		int H2= sc.nextInt();
		System.out.print("Enter Height of A3: ");
		int H3= sc.nextInt();
		if (A1>A2 && A1>A3){
			System.out.println("A1 is eldest");
		}
		else if(A1>A2 && A3>A1){
			System.out.println("A3 is eldest");
		}
		else{
			System.out.println("A2 is eldest");
		}
		if (H1>H2 && H1>H3){
				System.out.println("A1 is Tallest");
			}
		else if(H1>H2 && H3>H1){
				System.out.println("A3 is Tallest");
			}
		else{
			System.out.println("A2 is Tallest");
		}
	}
}
	
		