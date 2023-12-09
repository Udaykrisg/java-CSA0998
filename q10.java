import java.util.Scanner;
class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.print("Enter elements for the first array: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.print("Enter elements for the second array: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        System.out.print("Common elements:[");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break; // Move to the next element in the first array
                }
            }
        }
        System.out.print("]");
    }
}