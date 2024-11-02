package currency;

import java.util.Scanner;

public class CurrencyConverter {
    public static void convertCurrency() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select conversion type:");
        System.out.println("1. Dollar to INR\n2. Euro to INR\n3. Yen to INR\n4. INR to Dollar\n5. INR to Euro\n6. INR to Yen");
        int choice = sc.nextInt();
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();
        double result = 0;

        switch (choice) {
            case 1: result = amount * 83.0; break;  // USD to INR
            case 2: result = amount * 88.0; break;  // EURO to INR
            case 3: result = amount * 0.56; break;  // YEN to INR
            case 4: result = amount / 83.0; break;  // INR to USD
            case 5: result = amount / 88.0; break;  // INR to EURO
            case 6: result = amount / 0.56; break;  // INR to YEN
            default: System.out.println("Invalid choice."); return;
        }
        System.out.println("Converted amount: " + result);
    }
}
