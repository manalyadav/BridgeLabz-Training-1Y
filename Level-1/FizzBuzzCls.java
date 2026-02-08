import java.util.*;
class FizzBuzzCls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size= sc.nextInt();
		String arr[]= new String[size];
		if (size<0) {
			System.out.println("Invalid");
		} 
		//for (int i=0; i<size; i++){
		//	arr[i]=sc.next(); 
		//}
		for (int i = 0; i<arr.length; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				arr[i]="FizzBuzz";
			} 
			else if (i % 3 == 0) {
				arr[i]="Fizz";
			} 
			else if(i%5==0){
				arr[i]="Buzz";
			} 
			else
				arr[i]=String.valueOf(i);
			
		}
			System.out.println(Arrays.toString(arr));
		
    }
}
