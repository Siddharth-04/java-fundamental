import java.util.Scanner;

public class AddTwoNumbers{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		System.out.print("Enter the second number : ");
		int b = sc.nextInt();
		System.out.print("Enter the third number : ");
		int c = sc.nextInt();
		int d = (a+b+c)/3;
		System.out.print("Average of three number is  : " + d);
	}
}