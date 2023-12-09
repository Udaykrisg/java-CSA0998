import java.util.*;
class leap
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int y;
        System.out.println("Enter any Year:");
        y = s.nextInt();
        if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0))
        {
            System.out.println(y + " Is Leap Year");
        } else
        {
            System.out.println(y + " Is not a Leap Year");
        }
    }
}