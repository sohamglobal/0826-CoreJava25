abstract class Praffull
{
    public void show()
    {
        System.out.println("welcome to Praffull class");
    }
    public abstract void displayInfo();
       
}

class Soham extends Praffull
{
    public void test()
    {
        System.out.println("abstract class tested ok");
    }
    //taken from the base class
    public void displayInfo()
    {
        System.out.println("Name is Soham");
    }
}

class Swami extends Praffull
{
    public void displayInfo()
    {
        System.out.println("Name Aarya Kale");
    }
}


class TestAbstract
{
    public static void main(String[] args)
    {
        Soham s=new Soham();
        s.show();
        s.test();
        s.displayInfo();
    }
}