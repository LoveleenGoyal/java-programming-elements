import java.util.Scanner;

class BasicCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		float number1 = sc.nextInt();
		
		System.out.print("\nEnter number 2: ");
		float number2 = sc.nextInt();
		
		float add = number1 + number2;
		
		float subtract = number1 - number2;
		
		float multiply = number1 * number2;
		
		float divisin = number1 / number2;
		
		System.out.print("\nThe addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + add + ", " + subtract + ", " + multiply + ", and " + divisin);
	}
}
	

