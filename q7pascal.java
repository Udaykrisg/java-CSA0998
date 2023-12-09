import java.util.Scanner;
class q7pascal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=s.nextInt();
        for (int i=0;i<n;i++)
        {
            for (int k=0;k<n-i;k++)
            {
                System.out.print(" ");
            }
            int c = 1;
            for (int j=0;j<=i;j++)
            {
                System.out.print(c + " ");
                c=c*(i-j)/(j+1);
            }

            System.out.println();
        }
    }
}
