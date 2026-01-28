import java.util.*;
public class whilepower{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		System.out.println("Enter power: ");
		int m=sc.nextInt();
		int result=1;
		int i=1;
		if(n>0){
			if(m>0){
				while(i<=m){
					result=result*n;
					i++;
				}
			}
		}
		System.out.println("the power of a number is="+result);
	}
}