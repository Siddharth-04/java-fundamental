import java.util.Scanner;
import java.lang.Math.*;

public class PerimeterOfRectangle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		System.out.print("Enter the value of power : ");
		int power = sc.nextInt();
		double calculation = Math.pow(number,power);
		System.out.print("Power of " + number + " is : " + calculation); 
	}
}