import java.util.Scanner;

public class CalculateSimpleInterest{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principle : ");
		double principle = sc.nextDouble();
		System.out.print("Enter the rate of interest : ");
		double rateOfInterest = sc.nextDouble();
		System.out.print("Enter the time : ");
		int time = sc.nextInt();
		double interest = (principle*rateOfInterest*time)/100;
		System.out.print("Simple Interest calculated is : " + interest);
	}
}