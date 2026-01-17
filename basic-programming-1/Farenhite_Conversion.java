<<<<<<< HEAD
class FarenhiteConversion{
	public static void main(String args[]){
		int c= 45;
=======
import java.util.Scanner;
class FarenhiteConversion{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Celcius: ");
		int c= sc.nextInt();
>>>>>>> d88d3feab1f36f87a7c20ac16de9ca463315098d
		double Farenhite=(c*9/8)+32;
		System.out.println("Celcius to Farenhite: "+Farenhite);
	}
}