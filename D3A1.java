import java.util.*;
class Area
{
    public double area;
    public double h,r;
    void cal()
    {
        Scanner s=new Scanner(System .in);
        System.out.println("Enter Radius of circle:");
        r= s.nextDouble();
        area=3.14*r*r;
        System.out.println("Area of Circle is:"+area);
    }
}
class cy extends Area
{
    public double cyvol;
    void cal2()
    {
        Scanner s=new Scanner(System .in);
        System.out.println("Enter Radius and Height of Cylinder:");
        h= s.nextDouble();
        r= s.nextDouble();
        cyvol=area*h;
        System.out.println("Volume of Cylinder is:"+cyvol);
    }
}
class cone extends cy
{
    public double covol;
    void cal3()
    {
        Scanner s=new Scanner(System .in);
        System.out.println("Enter Radius and Height of cone:");
        h= s.nextDouble();
        r= s.nextDouble();
        covol=(cyvol)/3;
        System.out.println("Volume of Cone is:"+covol);
    }
}
class dis
{
    public static void main(String args[])
    {
        cone o=new cone();
        o.cal();
        o.cal2();
        o.cal3();
    }
}