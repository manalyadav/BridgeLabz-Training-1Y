import java.util.*;
class TableOfNumber{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter Number: ");
		int n= sc.nextInt();		
		int arr[]= new int[11];
		for (int i=0; i<11; i++){
			System.out.println(n + "*"+ i+"= "+n*i);
		}
	}
}