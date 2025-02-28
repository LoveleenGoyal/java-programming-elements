import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking perimeter input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Calculate the side length
        double side = perimeter / 4;

        // Display the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        // Close the scanner
        sc.close();
    }
}
