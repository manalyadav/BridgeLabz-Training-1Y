import java.util.Scanner;
public class countdigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        int n=num;
        int count=0;
        while (num!=0){
            int digit=num%10;
			count++;
            num=num/10;
        }
        System.out.println("Count of Digits: "+count);
    }
}
