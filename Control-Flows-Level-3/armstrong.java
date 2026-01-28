import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        int n=num;
        int result=0;
        while (num!=0){
            int digit=num%10;
			result+=(digit*digit*digit);
            num=num/10;
        }
        if(result==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not a Armstrong");
        }
    }
}
