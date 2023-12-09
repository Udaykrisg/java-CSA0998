import java.util.*;
import java.util.Arrays;
class m2
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the m:");
        int m=s.nextInt();
        System.out.print("Enter the n:");
        int n=s.nextInt();
        int mm=arr[size-m];
        int nn=arr[n-1];
        int sum=mm+nn;
        int diff =mm-nn;
        System.out.println("the mth max num is:"+mm);
        System.out.println("the nth min num is:"+nn);
        System.out.println("the sum is:"+sum);
        System.out.println("the differ is:"+diff);
    }
}