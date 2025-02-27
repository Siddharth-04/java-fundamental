import java.util.Scanner;

public class ConvertKilometersToMiles{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the distance in kilometers : ");
		double distanceInKilometers = sc.nextDouble();
		double distanceInMiles = distanceInKilometers * (0.621371); 
		System.out.print("Equivalent distance in miles is : " + distanceInMiles);
	}
}