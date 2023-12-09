import java.util.*;
class armstrong
{
    public static void main(String[] args)
    {
        int num,r,sum=0,temp;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        num=s.nextInt();
        temp=num;
        while (num>0)
        {
            r=num%10;
            sum=sum+(r*r*r);
            num=num/10;
        }
        if(temp==sum)
        {
            System.out.println(temp+"\t is a armstrong");
        }
        else {
            System.out.println(temp+"\t is not a armstrong");

        }
    }
}