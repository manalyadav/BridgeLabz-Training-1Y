<<<<<<< HEAD
class Conversion{
	public static void main(String args[]){
		int a= 45;
=======
import java.util.Scanner;
class Conversion{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter dist(in km): ");
		int a= sc.nextInt();
>>>>>>> d88d3feab1f36f87a7c20ac16de9ca463315098d
		double miles= a*1.6;
		System.out.print("dist(in miles): "+miles);
	}
}
	
		