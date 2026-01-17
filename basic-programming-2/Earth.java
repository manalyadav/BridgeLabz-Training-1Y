import java.util.Scanner;
class Earth{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter radius of Earth(in cubic km): ");
		int r= sc.nextInt();
		double vol= 4/3*3.14*r*r*r;
		double miles= vol*1.6;
		System.out.print("The volume of Earth(in cubic km) is: "+vol);
		System.out.print(" and the volume of Earth(in cubic miles) is: "+miles);
	}
}
	
		