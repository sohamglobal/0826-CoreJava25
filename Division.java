import java.util.*;

class Division
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x,y,res;
        try
        {
        System.out.print("Enter first number : ");
        x=sc.nextInt();
        System.out.print("Enter second number : ");
        y=sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            x=1;
            y=1;
        }

        try
        {
        res=x/y;
        }
        catch(ArithmeticException e)
        {
            System.out.println("cant divide by zero");
            res=x;
        }
        System.out.println("Division is "+res);
    }
}