public class DiscountToStudent {
	public static void main(String[] args) {
		// Given university fee and discount to offer
		int fee = 125000;
		int discountPercent = 10;
		
		// Computing discount by assigning to discount variable
		int discount = (fee * discountPercent) / 100;
		
		// Calculating fee to pay by subtracting discount from fee
		int feeToPay = fee - discount;
		
		// Print the result
		System.out.print("The discount amount is INR " + discount + " and final discounted fee is INR " + feeToPay);
	}
}
		

