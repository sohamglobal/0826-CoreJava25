class WelcomeUser
{
    public static void main(String args[])
    {
        String nm;
        try {
        nm=args[0];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
           nm="sohamglobal";
           System.out.println("You can send your name from the command line"); 
        }
        System.out.println("Welcome "+nm+" to Java");
    }
}