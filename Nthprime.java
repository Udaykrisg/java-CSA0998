import java.util.*;
class Nthprime
{
    public static void main(String[] args)
    {
        int n,flag=0;
        int arr[]=new int[100];
        System.out.println("Enter number:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=2;i<n;i++)
        {
            for(int j=2;j<i/2;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                arr[arr.length]=i;
            }
        }
        System.out.println(arr);
    }
}