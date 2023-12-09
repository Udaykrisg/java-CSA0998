import java.util.*;
class as2
{
    public static void main(String[] args)
    {
        String str1,str2;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter user name:");
        str1=in.nextLine();
        System.out.println("renter user name:");
        str2=in.nextLine();
        if (str1.equals(str2))
            System.out.println("user name is valid");
        else
            System.out.println("invalid user name");
    }
}