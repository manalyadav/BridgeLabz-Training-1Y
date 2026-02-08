import java.util.*;
class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n= sc.nextInt();
		int count=0;
		int c=0;
		for(int i=1; i<=n; i++){
			if(n%i==0){
				count++;
			}
		}
		int[] arr= new int[count];
		for(int i=1; i<=n; i++){
			if(n%i==0){
				arr[c]=i;
				c++;
			}
		}
		System.out.println("The Array of Factors of given number is: "+Arrays.toString(arr));
		
    }
}
