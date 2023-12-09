import java.util.*;
class Students
{
    public double tot,agg,flag=0;
    public double m1,m2,m3,m4;
    void getm()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Marks of Student:");
        m1=s.nextDouble();
        m2=s.nextDouble();
        m3=s.nextDouble();
        m4=s.nextDouble();
    }
}
class check extends Students
{
    void cal()
    {
        if(((m1<0 || m1>100)||(m2<0 || m2>100)||(m3<0 || m3>100)||(m4<0||m4>100)))
        {
            System.out.println("Enter proper marks");
        }
        else
        {
            tot=m1+m2+m3+m4;
            System.out.println("total marks:"+tot);
            agg=tot/4;
            System.out.println("Avarage:"+agg);
            flag=1;
        }
    }
}
class grades extends check
{
    void dis()
    {
        if(flag==1)
        {
            if(agg>75)
            {
                System.out.println("Distinction");
            }
            else if(agg>=60 && agg<75)
            {
                System.out.println("First Divison");
            }
            else if(agg>=50 && agg<60)
            {
                System.out.println("Second Divison");
            }
            else if(agg>=40 && agg<50)
            {
                System.out.println("Third Divison");
            }
            else
            {
                System.out.println("Fail");
            }
        }
        else
        {
            System.out.println("The Marks Range is 0-100");
        }
    }
}
class out
{
    public static void main(String args[])
    {
        grades o=new grades();
        o.getm();
        o.cal();
        o.dis();
    }
}
