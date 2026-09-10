import java.util.Scanner;

public class IT26101918Lab6Q1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = input.nextDouble();
        
        // Calculate square and square root
        double square = number * number;
        double squareRoot = Math.sqrt(number);
        
        // Display the results matching the expected output format
        System.out.println(); // Prints a blank line
        System.out.println("The square of " + number + " is : " + square);
        System.out.println("The square root of " + number + " is : " + squareRoot);
        
        // Close the scanner
        input.close();
    }
}
