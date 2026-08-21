class CheckedException
{
    public static void loadDBDriver() throws ClassNotFoundException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }

    public static void main(String[] args)
    {
        try
        {
        loadDBDriver();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("cant load DB driver");
        }
    }
}