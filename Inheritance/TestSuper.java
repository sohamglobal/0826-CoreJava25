class First
{
    public First()
    {
        System.out.println("Empty - Base");
    }
    public First(String name)
    {
        System.out.println("Para - Base - "+name);
    }
}

class Second extends First
{
    public Second()
    {
        super("Neha");
        System.out.println("Empty - Derived");
    }

}


class TestSuper
{
    public static void main(String args[])
    {
        Second s=new Second();

    }
}