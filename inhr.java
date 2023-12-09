import java.util.*;
class inhr
{
    protected double sum=0,fact=1;
    protected int i,n,j;
    void get()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number:");
        n= s.nextInt();
    }
}
class sum extends inhr
{
    void cal()
    {
        for(i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Sum is:"+sum);
    }
}
class facto extends sum
{
    void cal()
    {
        super.cal();
        for(i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("Fact is:"+fact);
    }
}
class output
{
    public static void main(String args[])
    {
        facto o=new facto();
        o.get();
        o.cal();
    }
}