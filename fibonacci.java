import java.util.*;
class fibonacci
{
    public static void main(String[] args)
    {
        int a=0,b=1,c,i,n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        n=s.nextInt();
        System.out.println("The fibonacci series is:");
        System.out.println(a+"\n"+b);
        for(i=2;i<=n;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}