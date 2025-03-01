public class DivideEqually {
	public static void main(String[] args) {
		// Given number of pens and number of students among pens to be distributed 
		int pens = 14;
		int students = 3;
		
		// Using modulus operator to find remaining pens
		int remainingPens = pens % students;
		
		// Using division operator to find quantity of pens
		int penPerStudent = pens / students;
		
		// Display the result
		System.out.print("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPens);
	}
}