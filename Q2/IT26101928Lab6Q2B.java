import java.util.Scanner;

public class IT26101928Lab6Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumSquares = 0;
        int count = 0;
        
        while (true) {
            System.out.print("Enter a positive integer (-99 to end): ");
            int num = sc.nextInt();
            
            if (num == -99) {
                break;
            }
            
            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
                continue;
            }
            
            sumSquares += num * num;
            count++;
        }
        
        if (count > 0) {
            double rms = Math.sqrt(sumSquares / count);
            System.out.printf("Root Mean Square = %.2f%n", rms);
        } else {
            System.out.println("No valid numbers entered.");
        }
        
        sc.close();
    }
}