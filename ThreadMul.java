class cl extends Thread
{
    public void run()
    {

        try
        {
            for(int i = 1; i<=10; i++)
            {
                System.out.println("5X"+i+"="+ i*5);
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Exiting A Thread");
    }
}
class bthread extends Thread
{
    public void run()
    {

        try
        {

            Thread.sleep(1100);
            for(int i = 1; i<=10; i++)
            {
                System.out.println("10X"+i+"="+i*10);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Exiting B Thread");
    }
}
class mul
{
    public static void main(String arg[])
    {
        cl a = new cl();
        bthread b = new bthread();
        a.start();
        b.start();
    }
}