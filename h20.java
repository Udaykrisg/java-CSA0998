import java.util.Scanner;

public class h20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input income
        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();

        // Calculate taxable income
        double taxableIncome = income - 250000;

        // Calculate tax based on taxable income
        double tax = 0;

        if (taxableIncome <= 0) {
            // No tax
            tax = 0;
        } else if (taxableIncome <= 250000) {
            // 10% tax
            tax = 0.1 * taxableIncome;
        } else if (taxableIncome <= 500000) {
            // 10% on the first 250,000 + 20% on the remaining
            tax = 0.1 * 250000 + 0.2 * (taxableIncome - 250000);
        } else if (taxableIncome <= 1000000) {
            // 10% on the first 250,000 + 20% on the next 250,000 + 30% on the remaining
            tax = 0.1 * 250000 + 0.2 * 250000 + 0.3 * (taxableIncome - 500000);
        } else {
            // 10% on the first 250,000 + 20% on the next 250,000 + 30% on the next 500,000 + 30% on the remaining
            tax = 0.1 * 250000 + 0.2 * 250000 + 0.3 * 500000 + 0.3 * (taxableIncome - 1000000);
        }

        // Display results
        System.out.println("Taxable Income: " + taxableIncome);
        System.out.println("Tax= " + tax);

        // Close the scanner
        scanner.close();
    }
}
