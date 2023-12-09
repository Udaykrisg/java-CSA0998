import java.util.Scanner;
public class m7Perfectnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n >= 0) {
                int count = 0;
                int num = 2; // Start checking from 2 as 1 is not a perfect number
                System.out.print("First " + n + " perfect numbers are: ");
                while (count < n) {
                    int sum = 1;
                    for (int i = 2; i * i <= num; i++) {
                        if (num % i == 0) {
                            sum += i;
                            if (i != num / i) {
                                sum += num / i;
                            }
                        }
                    }
                    if (sum == num) {
                        System.out.print(num + " , ");
                        count++;
                    }
                    num++;
                }
            } else {
                System.out.println("Please enter a non-negative integer for N.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer for N.");
        }
        sc.close();
    }
}