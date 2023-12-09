import java.util.Scanner;
class q9array
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter element"+(i+1)+":");
            array[i] = scanner.nextInt();
        }
        System.out.println("after removing:");
        for (int i = 0; i < n; i++)
        {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
