class Praffull extends Thread
{
    public void run()
    {
        System.out.println("Praffull Thread is running");
    }
}



class ExtendsDemo
{
    public static void main(String args[])
    {
        Praffull p=new Praffull();
        p.start();
    }
}