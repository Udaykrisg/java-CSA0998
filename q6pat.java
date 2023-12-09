import java.util.*;
class q6pat {
    public static void main(String[] args) {
        int i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num to print:");
        int num = s.nextInt();
        System.out.println("Enter no of times:");
        int n = s.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
