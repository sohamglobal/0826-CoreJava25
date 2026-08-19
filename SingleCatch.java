class SingleCatch
{
    public static void main(String[] args)
    {
        int n,sq;
        try {
        n=Integer.parseInt(args[0]);
        }
        catch(Exception e)
        {
            System.out.println("invalid or no value received");
            n=0;    
        }
        
        sq=n*n;
        System.out.println("Square is "+sq);
    }
}