public class Triangle
{
    private double a;
    private double b;
    private double c;
    public Triangle(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean isRight()
    {
        double hypotenuse = Math.max(a, Math.max(b, c));
        if (hypotenuse == a)
        {
            return a * a == b * b + c * c;
        }
        else if (hypotenuse == b)
        {
            return b * b == a * a + c * c;
        }
        else
        {
            return c * c == a * a + b * b;
        }
    }
    public boolean isScalene()
    {
        return a!=b && a!=c && b!=c;
    }
    public boolean isIsosceles()
    {
        return a == b || a == c || b == c;
    }
    public boolean isEquilateral()
    {
        return a == b && a == c;
    }
}
class Traingleclass
{
    public static void main(String[] args)
    {
        Triangle triangle1 = new Triangle(3, 4, 5);
        System.out.println("Is triangle1 a right triangle? " + triangle1.isRight());
        System.out.println("Is triangle1 scalene? " + triangle1.isScalene());
        System.out.println("Is triangle1 isosceles? " + triangle1.isIsosceles());
        System.out.println("Is triangle1 equilateral? " + triangle1.isEquilateral());
        Triangle triangle2 = new Triangle(5, 5, 5);
        System.out.println("Is triangle2 a right triangle? " + triangle2.isRight());
        System.out.println("Is triangle2 scalene? " + triangle2.isScalene());
        System.out.println("Is triangle2 isosceles? " + triangle2.isIsosceles());
        System.out.println("Is triangle2 equilateral? " + triangle2.isEquilateral());
    }
}