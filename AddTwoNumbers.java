import java.util.Scanner;

public class AddTwoNumbers{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		System.out.print("Enter the second number : ");
		int b = sc.nextInt();
		int c = a+b;
		System.out.print("Addition of two numbers is : " + c);
	}
}