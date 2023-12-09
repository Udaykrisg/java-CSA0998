import java.util.*;
class mt {
    public static void main(String[] args) {
        int i, j, k,n;
        int a[][] = new int[4][4];
        int b[][] = new int[4][4];
        int c[][] = new int[4][4];
        Scanner s = new Scanner(System.in);
        System.out.println("enter no of rows and column:");
        n=s.nextInt();
        System.out.println("enter the elements of matrix1:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("enter the elements of matrix1:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        System.out.println("multipled matrix  :");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                c[i][j] = 0;
                for(k=0;k<n;k++)
                {
                    c[i][j]+=a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}