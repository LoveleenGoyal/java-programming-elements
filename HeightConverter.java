import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking user input for height in cm
        System.out.print("Enter your height in centimeters: ");
        int heightInCm = sc.nextInt();

        // Conversion factors
        double cmPerInch = 2.54;  // 1 inch = 2.54 cm
        int inchesPerFoot = 12;   // 1 foot = 12 inches

        // Convert cm to inches
        double totalInches = heightInCm / cmPerInch;

        // Convert inches to feet and remaining inches
        int feet = (int) (totalInches / inchesPerFoot);  
		
		// Get the remaining inches
        double inches = totalInches % inchesPerFoot;     

        // Display results
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);
    }
}
