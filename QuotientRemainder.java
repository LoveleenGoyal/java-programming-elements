import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first number (dividend): ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int number2 = sc.nextInt();

        // Check if divisor is zero to avoid division by zero error
        if (number2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Calculate quotient and remainder
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            // Display the results
            System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
        }

        // Close the scanner
        sc.close();
    }
}
