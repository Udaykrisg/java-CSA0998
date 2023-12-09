import java.util.*;
class as3vot
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int ag;
		System.out.println(" enter the age of a person:");
		ag=s.nextInt();
		if(ag<=0)
		{
			System.out.println("invalid input");
		}
		else if(ag<18)
		{

		    System.out.println(" person is not eligible to vote");
			System.out.println(" person is  eligible to vote after\t" +(18-ag)+"\t years");

		}
		else
		{
		    System.out.println(" person is eligible to vote");
		}
	}
}