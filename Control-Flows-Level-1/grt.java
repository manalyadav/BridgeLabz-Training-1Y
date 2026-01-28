import java.util.Scanner;
class grt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
		System.out.println("Enter number: ");
        int b = sc.nextInt();
		System.out.println("Enter number: ");
        int c = sc.nextInt();
        if (a>b&&b>c){
            System.out.println("a is greater: "+a);
        }
        else if (b>a&&b>c){
            System.out.println("b is greater: "+b);
        }
		else{
			System.out.println("c is greater: "+c);
		}
    }
}
