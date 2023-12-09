import java.util.*;
class String1
{
    java.lang.String s1;
    void in()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name:");
        s1=s.nextLine();
    }
}
class cvts extends String1
{
    int i,l,uc=0,lc=0,ec=0;
    void cal()
    {
        l=s1.length();
        for(i=0;i<l;i++)
        {
            if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
            {
                uc++;
            }
            else if(s1.charAt(i)=='e' || s1.charAt(i)=='E')
            {
                System.out.println("Index of e is:"+i);
                ec++;
            }
            else
            {
                lc++;
            }
        }

    }
    void out()
    {
        System.out.println("Length:"+l);
        if(ec<1)
        {
            System.out.println("e is not present");
        }
        System.out.println("Lettr in pos 5 is:"+s1.charAt(4));
        System.out.println("Upper Count:"+uc);
        System.out.println("Lower Count:"+lc);
    }
    public static void main(String args[])
    {
        cvts o=new cvts();
        o.in();
        o.cal();
        o.out();
    }
}