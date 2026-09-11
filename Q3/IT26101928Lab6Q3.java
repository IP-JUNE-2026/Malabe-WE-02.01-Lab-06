import java.util.Scanner;

public class IT26101928Lab6Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumSquares = 0;
        int count = 0;
        int num;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            num = sc.nextInt();

            if (num == -99) {
                break;
            } else if (num > 0) {
                sumSquares += num * num;
                count++;
            } else {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            }
        }

        if (count > 0) {
            double rms = Math.sqrt(sumSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No valid numbers entered.");
        }

        sc.close();
    }
}