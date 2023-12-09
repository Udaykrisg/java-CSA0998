import java.util.*;
class vow
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String");
        String str=s.nextLine();
        String vol="",con="";
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            {
                vol=vol+ch+" ";
            }
            else {
                con=con+ch+" ";
            }
        }
        System.out.println("Consonents are:"+con);
        System.out.println("Vowels are:"+vol);
    }
}