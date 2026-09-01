//Multiple inheritance is not allowed with classes in Java

class One
{
    public void calcSquare(int n)
    {
        int sq;
        sq=n*n;
        System.out.println("Square is "+sq);
    }
}

class Two
{
    public void add(int a,int b)
    {
        int res;
        res=a+b;
        System.out.println("Sum is "+res);
    }
}

class Three extends One,Two
{
    public void calcDiscount(double amount)
    {
        double disc=amount*9/100;
        System.out.println("Discount will be "+disc);
    }
}

class MultipleInherit
{
    public static void main(String[] args)
    {
        Three obj=new Three();
        obj.add(9,13); //own function of class Two
        obj.calcSquare(75); //function of class One
        obj.calcDiscount(14300); // function of Three
    }
}