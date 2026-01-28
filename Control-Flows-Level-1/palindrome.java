import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        int n=num;
        int a=0;
        while (num!=0){
            a=num%10;
            num=num/10;
        }
        if(a==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
