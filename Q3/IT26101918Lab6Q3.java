import java.util.Scanner;

public class IT26101918Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumOfSquares = 0;
        int count = 0;
        
        System.out.println("Enter positive integers (terminate input with -99):");
        
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            // Check for termination condition first
            if (number == -99) {
                break;
            }
            
            // Validate for negative input
            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue; // Skip the rest of the loop and ask for input again
            }
            
            // Process valid positive numbers
            sumOfSquares += (number * number);
            count++;
        }
        
        // Calculate and display RMS if at least one valid number was entered
        if (count > 0) {
            double rms = Math.sqrt((double) sumOfSquares / count);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("\nNo valid numbers were entered to calculate RMS.");
        }
        
        scanner.close();
    }
}
