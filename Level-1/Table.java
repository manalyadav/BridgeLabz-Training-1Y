import java.util.*;
class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n= sc.nextInt();
		if(n>=6&&n<=9){	
			for (int i=1; i<11; i++){
				System.out.println(n+" * "+i+" = " +(n*i));
			}
		}
		else{
			System.out.println("Enter Number Between 6 to 9");
		}
    }
}
