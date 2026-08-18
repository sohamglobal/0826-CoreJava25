class ExampleNullObjects
{
    public static void main(String args[])
    {
        String nm=null;
        try
        {
        System.out.println(nm.length());
        }
        catch(NullPointerException e)
        {
            //System.out.println(e);
            //System.out.println(e.getMessage());
            System.out.println("cant calculate length of null objects");
        }
    }
}