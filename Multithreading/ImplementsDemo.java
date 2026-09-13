class Sharayu implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Sharayu thread running...");
    }
}

class ImplementsDemo
{
    public static void main(String args[])
    {
        Sharayu s=new Sharayu();
        Thread t=new Thread(s);
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
    }
}