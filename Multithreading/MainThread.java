class MainThread
{
    public static void main(String args[])
    {
        Thread t=Thread.currentThread();
        System.out.println("Welcome to Java");

        //System.out.println(t);
        System.out.println(t.getName());
    }
}