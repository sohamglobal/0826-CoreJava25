class One
{
    public void calcSquare(int n)
    {
        int sq;
        sq=n*n;
        System.out.println("Square is "+sq);
    }
    public final void show()
    {
         System.out.println("welcome to final");
    }
}

final class Two extends One
{
    public void add(int a,int b)
    {
        int res;
        res=a+b;
        System.out.println("Sum is "+res);
    }
/*
    public void show()
    {
        System.out.println("cant run");
    }
    */
}


class TestFinal
{
    public static void main(String[] args)
    {
        Two x=new Two();
        x.calcSquare(89);
        x.add(12,56);
        x.show();
    }
}