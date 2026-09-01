// base class, super, parent
class One
{
    public void calcSquare(int n)
    {
        int sq;
        sq=n*n;
        System.out.println("Square is "+sq);
    }
}
// derived class, sub, child
class Two extends One
{
    public void add(int a,int b)
    {
        int res;
        res=a+b;
        System.out.println("Sum is "+res);
    }
}

class SingleInherit
{
    public static void main(String[] args)
    {
        Two obj=new Two();
        obj.add(9,13); //own function of class Two
        obj.calcSquare(75); //function of class One
    }
}