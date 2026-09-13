class Babu extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(1500);
            }
            catch(InterruptedException e)
            {
                System.out.println("thread interrupted");
            }
        }
    }
}

class TimedWaiting
{
    public static void main(String[] args)
    {
        Babu b=new Babu();
        b.start();
    }
}