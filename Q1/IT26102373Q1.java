
import java.util.Scanner;

public class IT26102373Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Student " + i + ":");

            System.out.print("Enter marks for 4 subjects: ");

            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            int m4 = sc.nextInt();

            double average = (m1 + m2 + m3 + m4) / 4.0;

            if (average >= 75) {
                System.out.println("Grade is: Distinction");
            }
            else if (average >= 50) {
                System.out.println("Grade is: Credit");
            }
            else {
                System.out.println("Grade is: Fail");
            }

            System.out.println();
        }

        sc.close();
    }
}

