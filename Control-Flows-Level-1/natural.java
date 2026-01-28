import java.util.Scanner;
class natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
		int b= 0;
        if (a<1){
            System.out.println("Not a natural number");
        }
		else {
            for (int i=1; i<=a; i++){
				 b+=i;
			}
			System.out.println("Sum is "+b);
        }
    }
}
