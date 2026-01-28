import java.util.Scanner;
public class abundant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        int n=num;
        int sum=0;
		for(int i=1; i<=num-1; i++){
			if(num%i==0){
				sum+=i;
			}
		}
        if(sum>n){
            System.out.println("Abundant");
        }
        else{
            System.out.println("Not a Abundant");
        }
    }
}
