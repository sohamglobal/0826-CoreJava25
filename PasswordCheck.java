import java.util.*;

class PasswordCheck
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String password;

        System.out.print("Enter password : ");
        try {
        password=sc.next();
        if(password.length()<8)
        throw new Exception();

        System.out.println("Your password is "+password);
        }
        catch(Exception e)
        {
            System.out.println("Invalid password");
        }

    }
}