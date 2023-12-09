import java.util.*;
class sphere
{
    protected double area;
    void cal(double r)
    {
        area=3.14*r*r;
        System.out.println("Area of Sphere is:"+area);
    }
}
class cones extends sphere
{
    protected double volume;
    void cal(double r,double h,double l)
    {
        volume=(3.14*r*r*h)/3;
        area=3.14*r*l;
        System.out.println("Volume of cone is:"+volume);
        System.out.println("Area of cone is:"+area);
    }
}
class cly extends cones
{
    void cal(double r,double h)
    {
        volume=3.14*r*r*h;
        area=(2*3.14*r*h)+(2*3.14*r*r);
        System.out.println("Volume of Clyinder is:"+volume);
        System.out.println("Area of clyinder is:"+area);
    }
}
class Shape extends cly{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Radius:");
        double r=s.nextDouble();
        System.out.println("Enter Height:");
        double h=s.nextDouble();
        System.out.println("Enter Lenght of cone:");
        double l=s.nextDouble();
        cly o=new cly();
        o.cal(r);
        o.cal(r,h,l);
        o.cal(r,h);
    }
}