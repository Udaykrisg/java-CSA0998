import java.util.*;
class Strings
{
    java.lang.String s1;
    java.lang.String s2;
    java.lang.String s3;
    void in()
    {
        s1="I Love Java";
        s2="JAVA";
        s3="java";
    }
}
class cvt extends Strings
{
    java.lang.String str1,str2,str3,str4,str5;
    int str6,str7,str11;
    char str10;
    boolean str8,str9;
    void cal()
    {
        str1=s1.toLowerCase();
        str2=s1.toUpperCase();
        str3=s1.replace("o","i");
        str4=s1.substring(2);
        str5=s1.substring(2,6);
        str6=s1.indexOf("L");
        str7=s1.length();
        str8=s2.equals(s3);
        str9=s2.equalsIgnoreCase(s3);
        str10=s1.charAt(5);
        str11=s2.compareTo(s3);
    }
    void out()
    {
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
        System.out.println(str9);
        System.out.println(str10);
        System.out.println(str11);
    }
    public static void main(String args[])
    {
        cvt o=new cvt();
        o.in();
        o.cal();
        o.out();
    }
}