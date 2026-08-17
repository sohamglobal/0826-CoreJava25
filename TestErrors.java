import java.util.*; 

class TestErrors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sq;
        System.out.print("Enter a number : ");
        try
        {
            n=sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            n=0;
            System.out.println("Invalid input, number expected...set to zero");
        }
        finally
        {
            System.out.println("Exception Handling is Great!");
        }
        sq=n*n;
        System.out.println("Square of "+n+" is "+sq);
    }
}