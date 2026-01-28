import java.util.Scanner;
class BMI{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter weight(in kg): ");
		double w=sc.nextDouble();
		System.out.println("Enter height(in cm): ");
		double h=sc.nextDouble();
		double bmi=w*10000/(h*h);
		System.out.println("Your BMI is: "+bmi);
		if(bmi<=18.4){
			System.out.println("Underwieght");
		}
		else if (bmi>=18.5&&bmi<=24.9){
			System.out.println("Normal");
		}
		else if (bmi>=25.0&&bmi<=39.9){
			System.out.println("Overweight");
		}
		else if (bmi<=40){
			System.out.println("Obese");
		}
	}
}