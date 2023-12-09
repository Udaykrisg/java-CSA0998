import java.util.*;
class con
{
    public con(double p,double t,double r)
    {

        double c=(p*t*r)/100;
        System.out.println(c);
    }
    public static void main(String args[])
    {
        double p,t,r;
        Scanner s=new Scanner(System .in);
        System.out.println("Enter any P, T and R:");
        p=s.nextDouble();
        t=s.nextDouble();
        r=s.nextDouble();
        con o=new con(p,t,r);
    }
}