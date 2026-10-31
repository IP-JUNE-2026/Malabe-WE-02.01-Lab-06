
public class Main {
    public static void IT26102373Q2(String[] args) {

        // (a) 5 rows of $
        System.out.println("Pattern A:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }

        // (b) Increasing stars
        System.out.println("\nPattern B:");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " - ");

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // (c) Decreasing numbers
        System.out.println("\nPattern C:");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
