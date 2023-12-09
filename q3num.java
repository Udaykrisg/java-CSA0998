import java.util.*;
class q3num
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int n=s.nextInt();
        for (i=1;i<=n;i++)
        {
            for (j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++)
            {
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}