import java.util.*;
public class odeve
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Enter any Number:");
        a = s.nextInt();
        if (a % 2 == 0)
        {
            System.out.println(a + " is Even");
        } else
        {
            System.out.println(a + " is Odd");
        }
    }
}