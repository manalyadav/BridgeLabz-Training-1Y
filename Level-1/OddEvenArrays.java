import java.util.*;
class OddEvenArrays{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();								
		int size=(num/2)+1;                     
		int[] arr= new int[size];				
		int[] orr=new int[size];				
		int e=0, o=0;
		for (int i=1; i<num; i++){				
			if(i%2==0){							
				arr[e]=i;						
				e++;
			}
			else{
				orr[o]=i;						
				o++;
			}
		}
		System.out.println("Arrays of Even Number is: "+ Arrays.toString(arr));
		System.out.println("Arrays of Odd Numbers is: "+ Arrays.toString(orr));
	}
}