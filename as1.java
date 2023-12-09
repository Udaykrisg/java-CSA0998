import java.util.*;
class as1
{
    public static void main(String[] args)
    {
        String str,reversedStr = "";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string:");
        str=in.nextLine();
        for(int i = str.length()-1; i >= 0; i--){
            reversedStr = reversedStr + str.charAt(i);
        }
        System.out.println("Original string: " + str);
        System.out.println("Reverse of given string: " + reversedStr);
    }
}