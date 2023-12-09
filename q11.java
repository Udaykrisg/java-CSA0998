import java.util.*;
class acs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of strings: ");
        n = sc.nextInt();
        String[] s1 = new String[n];
        String temp;
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++)
            s1[i] = sc.next();
        System.out.print("Enter the order (D/A): ");
        char ch = sc.next().charAt(0);
        if (ch == 'D') {
            for (int i = 0; i < n - 1; i++)
                for (int j = i + 1; j < n; j++)
                    if (s1[i].compareTo(s1[j]) < 0) {
                        temp = s1[i];
                        s1[i] = s1[j];
                        s1[j] = temp;
                    }
        }
        if (ch == 'A') {
            for (int i = 0; i < n - 1; i++)
                for (int j = i + 1; j < n; j++)
                    if (s1[i].compareTo(s1[j]) > 0) {
                        temp = s1[i];
                        s1[i] = s1[j];
                        s1[j] = temp;
                    }
        }
        System.out.println("Sorted strings:");
        for (int i = 0; i < n; i++)
            System.out.println(s1[i] + " ");
    }
}
