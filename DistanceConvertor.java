import java.util.Scanner;

public class DistanceConvertor {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking distance input in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Conversion factors
        double feetToYards = 1.0 / 3; // 1 yard = 3 feet
        double yardsToMiles = 1.0 / 1760; // 1 mile = 1760 yards

        // Convert to yards and miles
        double distanceInYards = distanceInFeet * feetToYards;
        double distanceInMiles = distanceInYards * yardsToMiles;

        // Display the results
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);

        // Close the scanner
        sc.close();
    }
}
