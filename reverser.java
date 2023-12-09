import java.util.*;
class reverser
{
  public static void main(String[] args)
  {
    int number,reverse = 0;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number:");
    number=in.nextInt();
    for( ;number != 0; number=number/10)
    {
       int remainder = number % 10;
       reverse = reverse * 10 + remainder;
    }
     System.out.println("The reverse of the given number is: " + reverse);
  }
}