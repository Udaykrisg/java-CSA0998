import java.util.*;
class simple
{
    int p,t,r,q;
    void cal()
    {
        Scanner s=new Scanner(System .in);
        p= s.nextInt();
        t= s.nextInt();
        r= s.nextInt();
        q=(p*t*r)/100;
        System.out.println(q);
    }
    public static void main()
    {
        simple o=new simple();
        o.cal();
    }
}