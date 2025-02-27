import java.util.Scanner;

public class PerimeterOfRectangle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of rectangle : ");
		int length = sc.nextInt();
		System.out.print("Enter the breadth of rectangle : ");
		int breadth = sc.nextInt();
		int perimeter = 2*(length+breadth);
		System.out.print("Perimeter of Rectangle is : " + perimeter);
	}
}