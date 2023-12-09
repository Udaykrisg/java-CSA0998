import java.util.*;
class sor
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no:of words:");
        int n=s.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter words:");
        for (int i=0;i<n;i++)
        {
            arr[i]=s.next();
        }
        System.out.println("Enter Order D/A:");
        char ch=s.next().charAt(0);
        for (int i=0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (ch=='D')
                {
                    if (arr[i].compareTo(arr[j])<0)
                    {
                        String temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
                else
                {
                    if (arr[i].compareTo(arr[j])>0)
                    {
                        String temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        System.out.println("Sorted words are:");
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}