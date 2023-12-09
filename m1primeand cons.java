import java.util.*;
class CountPrimeComposite {
    public static void main(String args[]) {
        int p = 0, c = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of numbers:");
        int n = sc.nextInt();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    c += 1;
                    break;
                } else {
                    p += 1;
                    break;
                }
            }
        }

        System.out.println("Count of prime numbers: " + p);
        System.out.println("Count of composite numbers: " + c);
    }
}