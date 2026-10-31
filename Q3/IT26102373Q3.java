import java.util.Scanner;

public class IT26102373Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double DISCOUNT_RATE = 0.05;   // 5% festive discount
        final int CUSTOMERS = 5;
        double totalDiscountGiven = 0;

        for (int i = 1; i <= CUSTOMERS; i++) {
            System.out.println("\n--- Customer " + i + " ---");

            System.out.print("Enter total bill amount: ");
            double bill = sc.nextDouble();

            // Validate mode of payment (only C or O allowed)
            String mode;
            while (true) {
                System.out.print("Enter mode of payment (C = Cash, O = Other): ");
                mode = sc.next();

                if (mode.equals("C") || mode.equals("O")) {
                    break;
                }
                System.out.println("Payment type " + mode + " is not valid");
            }

            double discount = 0;
            if (mode.equals("C")) {
                discount = bill * DISCOUNT_RATE;
            }

            double amountToPay = bill - discount;
            totalDiscountGiven += discount;

            System.out.println("Discount      : " + discount);
            System.out.println("Amount to pay : " + amountToPay);
        }

        System.out.println("\nTotal discount given by the supermarket: " + totalDiscountGiven);
        sc.close();
    }
}