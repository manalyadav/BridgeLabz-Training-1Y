import java.util.Scanner;
class Season {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter months: ");
		int a = sc.nextInt();
		System.out.println("Enter date ");
        int b = sc.nextInt();
        if (a>=3&& a<=6) {
			if(b<=20&&a==3){
				System.out.println("Not a Spring Season");
			}
			else if(b>=20&&a==6){
				System.out.println("Not a Spring Season");
			}
			else{
				System.out.println("Spring Season");
			}
        }
        else{
            System.out.println("Not a Spring Season");
        }
    }
}
