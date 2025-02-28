import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking base and height input in cm
        System.out.print("Enter the base of the triangle in cm: ");
        double base = sc.nextDouble();
        
        System.out.print("Enter the height of the triangle in cm: ");
        double height = sc.nextDouble();

        // Calculate the area in square cm
        double areaSqCm = 0.5 * base * height;

        // Convert square cm to square inches
        double conversionFactor = 2.54 * 2.54; // 1 inch² = 2.54² cm²
        double areaSqIn = areaSqCm / conversionFactor;

        // Display the results
        System.out.println("The Area of the triangle in square cm is: " + areaSqCm);
        System.out.println("The Area of the triangle in square inches is: " + areaSqIn);

        // Close the scanner
        sc.close();
    }
}
