import java.util.*;
class h3{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int totalu,stafu,nstu,stu;
        System.out.println("enter total no of users :");
        totalu=s.nextInt();
        System.out.println("enter no of staff users");
        stafu=s.nextInt();
        if(totalu<=0 ||stafu<=0)
        {
            System.out.println("invalid input piz enter pos values of user:");
        }
        else if(totalu==stafu){
            System.out.println("invalid input or given input users are only staff there are no student users in this case::");
        }
        else if(totalu<=stafu){
            System.out.println("invalid input");
        }
        else {
            nstu=stafu/3;
            stu=totalu-nstu-stafu;
            System.out.println("the student users are:"+stu);
        }
    }
}