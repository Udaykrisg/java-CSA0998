import java.util.Scanner;
class m3ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] denominations = { 2000, 500, 200, 100 };
        int totalBalance = 0;

        for (int i = 0; i < denominations.length; i++)
        {
            System.out.println("Enter the " + (i + 1) + " Denomination:");
            int denomination = sc.nextInt();

            boolean validDenomination = false;
            for (int d : denominations)
            {
                if (d == denomination)
                {
                    validDenomination = true;
                    break;
                }
            }

            if (validDenomination)
            {
                System.out.println("Enter the " + (i + 1) + " Denomination number of notes:");
                int numberOfNotes = sc.nextInt();

                totalBalance += denomination * numberOfNotes;
            } else
            {
                System.out.println("Invalid denomination. Please enter a valid denomination.");
                i--;
            }
        }

        System.out.println("Total Available Balance in ATM: " + totalBalance);
    }
}