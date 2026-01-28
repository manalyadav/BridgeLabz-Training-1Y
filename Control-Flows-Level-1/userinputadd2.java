import java.util.Scanner;
class userinputadd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        double a = sc.nextDouble();
		double total=0.0;
		total+=a;
		while (true){
			a = sc.nextDouble();
			if(a<=0){
				break;
			}
			else{
				total+=a;
			}
		}
		System.out.println("Sum is: "+total);
    }
}
