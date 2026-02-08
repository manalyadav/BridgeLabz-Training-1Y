import java.util.Scanner;
class CompareNumbers{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);		
		int arr[]= new int[5];
		for (int i=0; i<5; i++){
			System.out.println("Enter Number " +(i+1) + ": ");
			arr[i]=sc.nextInt();
		}
		for (int i=0; i<5; i++){
			if (arr[i]>0){
				System.out.println("Number "+(i+1) +": Positive");
				if(arr[i]%2==0){
					System.out.println("Number "+(i+1) +": Even");
				}
				else{
					System.out.println("Number "+(i+1) +": Odd");
				}
			}
			else if(arr[i]==0){
				System.out.println("Nuumber "+(i+1) +": zero");
			}
			else{
				System.out.println("Number "+(i+1) +": negative");
			}
		}
		if(arr[0]==arr[4]){
			System.out.println("Number 1 is equal to number 5.");
		}
		else if (arr[0]>arr[4]){
			System.out.println("Number 1 is greater than number 5.");
		}
		else{
			System.out.println("Number 1 is smaller than number 5.");
		}
	}
}