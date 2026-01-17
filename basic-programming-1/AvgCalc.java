import java.util.Scanner;
class AvgCalc{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Maths Marks: ");
		int a= sc.nextInt();
		System.out.print("Enter Phy Marks: ");
		int b= sc.nextInt();
		System.out.print("Enter Chem Marks: ");
		int c= sc.nextInt();
		int avg= (a+b+c)/3;
		System.out.print("Average of marks is: "+avg);
	}
}
	
		