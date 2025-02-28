import java.util.Scanner;

class PurchaseCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking user input for unit price and quantity
		System.out.print("Enter the unit price of an item (INR): ");
		int unitPrice = sc.nextInt();
		
		System.out.print("Enter the quantity to be bought: ");
		int quantity = sc.nextInt();
		
		// Calculate total price
		int totalPrice = unitPrice * quantity;
		
		// Display the result
		System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and the unit price is INR " + unitPrice );
		
		// Close the scanner
		sc.close();
	}
}
		
		
