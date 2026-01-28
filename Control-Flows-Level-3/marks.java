import java.util.Scanner;
class marks{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter phy marks(out of 100): ");
		int ph=sc.nextInt();
		System.out.println("Enter chem marks(out of 100): ");
		int c=sc.nextInt();
		System.out.println("Enter maths marks(out of 100): ");
		int m=sc.nextInt();
		int avg=(ph+c+m)/3;
		int total=ph+c+m;
		int p=(total)*100/300;
		System.out.println("Average is: "+avg);
		if(p>=100){
			System.out.println("Grade: A");
			System.out.println("Level 4, above agency-normalized standards");
		}
		else if (p>=70&&p<=79){
			System.out.println("Grade: B");
			System.out.println("Level 3, at agency-normalized standards");
		}
		else if (p>=60&&p<=69){
			System.out.println("Grade: C");
			System.out.println("Level 2, below but approaching agency-normalized standards");
		}
		else if (p>=50&&p<=59){
			System.out.println("Grade: D");
			System.out.println("Level 1, well below agency-normalized standards");
		}
		else if(p>=40&&p<=49){
			System.out.println("Grade: E");
			System.out.println("Level 1-, too below agency-normalized standards");
		}
		else{
			System.out.println("Grade: R");
			System.out.println("Remidial standards");
		}
	}
}