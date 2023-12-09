import java.util.Scanner;
public class h5 {
    public static void main(String[] args) {
        int l, u, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower range:");
        l = sc.nextInt();
        System.out.println("Enter upper range:");
        u = sc.nextInt();
        int[] arr = new int[100];
        if (l < 0 || l == u || l > u || u<0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            for (int i = l; i <= u; i++) {
                double sqrt = Math.sqrt(i);
                if (sqrt == Math.floor(sqrt)) {
                    int rem, sum = 0;
                    int temp = i;

                    while (temp > 0) {
                        rem = temp % 10;
                        sum += rem;
                        temp = temp / 10;
                    }

                    if (sum < 10) {
                        arr[c] = i;
                        c++;
                    }
                }
            }

            if (c > 0)
            {
                System.out.println("Perfect squares with sum of digits less than 10:");
                for (int i = 0; i < c; i++)
                {
                    System.out.print(arr[i] + " ");
                }
            }
            else
            {
                System.out.println("No perfect squares between " + l + " and " + u);
            }
        }

    }
}
