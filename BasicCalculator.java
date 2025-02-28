import java.util.Scanner; // Import Scanner for user input

// Class to create a basic calculator
class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        // Asking user to enter first number
        System.out.print("Enter number 1: ");
        float number1 = sc.nextFloat();

        // Asking user to enter second number
        System.out.print("Enter number 2: ");
        float number2 = sc.nextFloat();

        // Performing arithmetic operations
        float addition = number1 + number2; 
        float subtract = number1 - number2;
        float multiply = number1 * number2;
        float division = number1 / number2; 

        // Displaying results
        System.out.println("\nThe addition, subtraction, multiplication, and division value of 2 numbers " 
            + number1 + " and " + number2 + " is " 
            + addition + ", " + subtract + ", " + multiply + ", and " + division);
    }
}
