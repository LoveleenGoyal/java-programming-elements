import java.util.Scanner;

public class IntOperation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking input values a, b, and c
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        // Performing integer operations
        int result1 = a + b * c;   
        int result2 = a * b + c;   
        int result3 = c + a / b;   
        int result4 = a % b + c;   

        // Display the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        // Close the scanner
        sc.close();
    }
}