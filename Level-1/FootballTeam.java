import java.util.*;
class FootballTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of players: ");
        int p= sc.nextInt();
		int sum=0;
		if (p<0) {
			System.out.println("Invalid");
		} 
		for (int i = 0; i<arr.length; i++) {
			System.out.println("Enter Height of Player "+(i+1)+"(in cm): ");
			int arr[i]=nextInt();
			sum+=arr[i];
		}
		int mean= sum/p;
		System.out.println("The Mean Height of Players is: "+mean+" cm.");
		
    }
}
