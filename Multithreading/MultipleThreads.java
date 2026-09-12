class Aarya extends Thread
{
    private String name;
    public Aarya(String name)
    {
        this.name=name;
    }
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(name+" "+i);
        }
    }
}

class MultipleThreads
{
    public static void main(String args[])
    {
       Aarya a1=new Aarya("A");
       Aarya a2=new Aarya("B");
       a1.start();
       a2.start(); 
    }
}