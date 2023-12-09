import java.util.*;
public class dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        if (decimal == 0) {
            System.out.println("the binary is : 0");
        }
        int binaryResult = 0;
        int place = 1;
        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryResult += remainder * place;
            place *= 10;
            decimal /= 2;
        }
        System.out.println("Binary representation: " + binaryResult);
        int sum=0;
        while (binaryResult!=0) {
            int remainder = binaryResult % 10;
            sum=sum*10+remainder;
            binaryResult /= 10;
        }
        int dec = 0, i = 0, rem;
        while (sum!=0) {
            rem = sum % 10;
            sum /= 10;
            dec += rem * Math.pow(2, i);
            ++i;
        }
        System.out.println(dec);

    }
}