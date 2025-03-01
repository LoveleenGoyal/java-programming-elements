import java.util.Scanner;

public class KmsToMiles {
	public static void main(String[] args){
		// Create scanner object to take user input
		Scanner sc = new Scanner(System.in);
		
		// Create a variable for distance in kilometers
		System.out.print("Enter the distance in kms : ");
		double km = sc.nextDouble();
		
		// Using 1 mile = 1.6 km
		double conversionFactor = 1.6;
		
		// Calculating distance in miles
		double distanceInMiles = km / conversionFactor;
		
		// Printing the result
		System.out.println("The Total miles is " + distanceInMiles + " mile for the given " + km);
	}
}