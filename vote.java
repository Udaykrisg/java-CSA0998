import java.util.*;
class vote
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System .in);
        int y;
        System.out.println("Enter Age of a person:");
        y=s.nextInt();
        if(y>=18)
        {
            System.out.println("Person is Elegible to Vote");
        }
        else
        {
            System.out.println("Person is Not elegible to vote");
        }
    }
}