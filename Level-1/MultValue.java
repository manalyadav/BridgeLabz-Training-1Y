import java.util.*;
class MultValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size(<=10): ");
        int size= sc.nextInt();
		int sum=0;
		if(size>10){
			return;
		}
		int arr[]= new int[size];
		for (int i=0; i<size; i++){
			System.out.println("Enter Value "+(i+1)+": ");
			arr[i]=sc.nextInt();
			if(arr[i]<=0){
				break;
			}
			sum+=arr[i];
		}
		System.out.println("The Values in Array is: "+Arrays.toString(arr));
		System.out.println("The Sum is: "+sum);
    }
}
