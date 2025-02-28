import java.util.Scanner;

//Create AverageMarks class to calculate Sam's average marks in PCM 
class AverageMarks{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Create a variable for marks in maths out of 100
		int math = 94;
		
		//Create a variable for marks in physics out of 100
		int physics = 95;
		
		//Create a variable for marks in chemistry out of 100
		int chemistry = 96;
		
		//Create a variable for calculating  average marks 
		int average = (math + physics + chemistry)/3;
		
		//Printing the average percent mark in PCM
		System.out.print("Sam's Average mark in PCM is : " + average);
	}
}

