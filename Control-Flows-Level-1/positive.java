import java.util.Scanner;
class positive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = sc.nextInt();
        if (a>0) {
            System.out.println("Positive");
        }
		else if(a==0){
            System.out.println("zero");
        }
        else{
            System.out.println("Negative");
        }
    }
}
