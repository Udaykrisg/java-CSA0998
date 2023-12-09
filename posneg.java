import java.util.*;
class posneg
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System .in);
        int y;
        System.out.println("Enter number to check:");
        y=s.nextInt();
        if(y<0)
        {
            System.out.println("niumber is negative");
        }
        else if (y==0)
        {
            System.out.println("number is a zero");
        }
        else
        {
            System.out.println("niumber is positive");

        }
    }
}