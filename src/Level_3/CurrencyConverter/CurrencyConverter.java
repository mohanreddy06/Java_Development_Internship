package Level_3.CurrencyConverter;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Currency Converter =====");

        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. EUR to INR");
        System.out.println("4. INR to EUR");
        System.out.println("5. GBP to INR");
        System.out.println("6. INR to GBP");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        double result = 0;

        switch (choice) {

            case 1:
                result = amount * 88.00;
                System.out.println("USD " + amount + " = INR " + result);
                break;

            case 2:
                result = amount / 88.00;
                System.out.println("INR " + amount + " = USD " + result);
                break;

            case 3:
                result = amount * 103.00;
                System.out.println("EUR " + amount + " = INR " + result);
                break;

            case 4:
                result = amount / 103.00;
                System.out.println("INR " + amount + " = EUR " + result);
                break;

            case 5:
                result = amount * 119.00;
                System.out.println("GBP " + amount + " = INR " + result);
                break;

            case 6:
                result = amount / 119.00;
                System.out.println("INR " + amount + " = GBP " + result);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
