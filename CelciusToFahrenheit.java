import java.util.Scanner;

public class CelciusToFahrenheit{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature in celcius : ");
		double celcius  = sc.nextDouble();
		double fahrenheit = (celcius*9/5)+ 32;
		System.out.print(celcius + " celcius in fahrenheit is : " + fahrenheit);
	}
}