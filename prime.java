import java.util.*;
class prime
{
    public static void main(String[] args)
    {
        int n,i,count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the numbe:");
        n=s.nextInt();
        if (n == 0 || n == 1)
            count = 1;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println(n+"\t is a prime number");
        }
        else {
            System.out.println(n+"\t is not a prime number");

        }
    }
}