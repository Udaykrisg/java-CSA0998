import java.util.*;
class as5
{
    public static void main(String args[])
    {
        int m, year, week, day;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days:");
        m = s.nextInt();
        if(m<=0)
        {
            System.out.println("invalid input");
        }
        else
        {
            year = m / 365;
            m = m % 365;
            System.out.println("No. of years:" + year);
            week = m / 7;
            m = m % 7;
            System.out.println("No. of weeks:" + week);
            day = m;
            System.out.println("No. of days:" + day);
        }
    }
}