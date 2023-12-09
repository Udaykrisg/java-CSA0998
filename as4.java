import java.util.*;
class as4
{
    public static void main(String[] args)
    {
        float p,t,si,n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter principle amount:");
        p=s.nextFloat();
        System.out.println("enter duration in years:");
        t=s.nextFloat();
        System.out.println("is cu stomer senior citizen (enter '0'  for 'yes'/ '1' for 'no')");
        n=s.nextInt();
        if(n==0)
        {
            System.out.println("12% of roi for senior citize");
            si=(p*t*12)/100;
        }
        else
        {
            si=(p*t*10)/100;
        }
        System.out.println("intrest="+si);
    }
}