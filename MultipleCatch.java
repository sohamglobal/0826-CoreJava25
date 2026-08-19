class MultipleCatch
{
    public static void main(String[] args)
    {
        int n,sq;
        try {
        n=Integer.parseInt(args[0]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("no value received");
            n=0;    
        }
        catch(NumberFormatException e)
        {
            System.out.println("invalid input");
            n=0;
        }
        sq=n*n;
        System.out.println("Square is "+sq);
    }
}