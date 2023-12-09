import java.util.*;
class q3
{
    public static void main(String[] args)
    {
        int i,n,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter num:");
        n=s.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
            else
            {
                sum=sum;
            }
        }
        if(sum==n)
        {
            System.out.println("Perfect");
        }
        else
        {
            System.out.println("Not perfect");
        }
    }
}