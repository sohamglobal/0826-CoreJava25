class Soham 
{
    public void show()
    {
        for(int i=1;i<=10;i++)
        System.out.println(i);
    }
}

class NoThread
{
    public static void main(String[] args)
    {
        Soham s1=new Soham();
        Soham s2=new Soham();

        System.out.println("Object-1");       
        s1.show();
        System.out.println("Object-2"); 
        s2.show();
    }
}