import java.util.Scanner;
class ProfitCalc{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Cost Price: ");
		int a= sc.nextInt();
		System.out.println("Enter Sell Price: ");
		int b= sc.nextInt();
		int profit= b-a;
		int profitPercentage= (profit)*100/a;
		System.out.println("Profit is: "+profit);
		System.out.println("Profit Percentage is: "+profitPercentage);
	}
}
	
		