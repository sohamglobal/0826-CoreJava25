class One
{
    public void calcSquare(int n)
    {
        int sq;
        sq=n*n;
        System.out.println("Square is "+sq);
    }
}

class Two extends One
{
    public void add(int a,int b)
    {
        int res;
        res=a+b;
        System.out.println("Sum is "+res);
    }
}

class Three extends One
{
    public void calcDiscount(double amount)
    {
        double disc=amount*9/100;
        System.out.println("Discount will be "+disc);
    }
}

class HierarchicalInherit
{
    public static void main(String[] args)
    {
       Two o2=new Two();
       o2.add(11,45);
       o2.calcSquare(63);

        Three o3=new Three();
        o3.calcSquare(77);
        o3.calcDiscount(21350);


    }
}