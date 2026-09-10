import java.util.Scanner;

public class IT26101918Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Please enter 10 numbers:");

        // Loop to accept 10 numbers from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; // Add the entered number to the sum
        }

        // Display the numbers entered
        System.out.println("\nThe numbers you entered are:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // Move to the next line

        // Calculate the average as a double to display the decimal point
        double average = (double) sum / 10;

        // Display the Sum and Average
        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
        
        scanner.close();
    }
}
