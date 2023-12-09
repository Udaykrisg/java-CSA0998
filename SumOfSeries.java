import java.util.*;
class SumOfSeries
{
    public static void main(String[] args)
    {
        int n,i,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number to print sum upto:");
        n=s.nextInt();
        for(i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum upto enterd number is:"+sum);
    }
}