import java.util.Scanner;
class HarryPotter{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Harry's year of birth");
		int a= sc.nextInt();
		System.out.print("Enter Current Year");
		int b= sc.nextInt();
		int age=b-a;
		System.out.print("Harry's Age: "+age);
	}
}
	
		