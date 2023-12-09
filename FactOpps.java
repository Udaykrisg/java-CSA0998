import java.util.*;
class FactOpps
{
    int i,n,t=1;
    void dec()
    {
        Scanner s=new Scanner(System .in);
        System.out.println("Enter any number:");
        n= s.nextInt();
    }
    void cal()
    {
        for(i=1;i<=n;i++)
        {
            t=t*i;
        }
        System.out.println("Fact is:"+t);
    }
    public static void main(String args[])
    {
        FactOpps o=new FactOpps();
        o.dec();
        o.cal();
    }
}