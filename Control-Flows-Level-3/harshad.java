import java.util.Scanner;
public class harshad {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        int n=num;
		int sum=0;
        int result=0;
        while (num!=0){
            int digit=num%10;
			sum+=digit;
            num=num/10;
        }
        if(n%sum==0){
            System.out.println("harshad");
        }
        else{
            System.out.println("Not a harshad");
        }
    }
}
