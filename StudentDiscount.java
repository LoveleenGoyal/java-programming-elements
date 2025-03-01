import java.util.Scanner;

public class StudentDiscount {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking user input for fee and discount percentage
        System.out.print("Enter the Student Fee (INR): ");
        int fee = sc.nextInt();

        System.out.print("Enter the University Discount Percentage: ");
        int discountPercent = sc.nextInt();

        // Calculate the discount amount
        int discount = (fee * discountPercent) / 100;

        // Calculate the final payable fee after discount
        int finalFee = fee - discount;

        // Display results in a single print statement
        System.out.println("The discount amount is INR " + discount + " and the final discounted fee is INR " + finalFee);
    }
}
