import java.util.Scanner;

public class nsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        try {
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }

            System.out.println("Sum of the entered numbers: " + sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. Make sure you enter exactly " + n + " numbers.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
