class MyException extends Exception
{
    int excep;
    MyException(int a)
    {
        excep=a;
    }
    public String toString()
    {
        return ("MyException[" + excep +"] is less than zero");
    }
}
class Q10
{
    static void sum(int c) throws MyException
    {
        if(c<0) {
            throw new MyException(c);
        }
    }
    public static void main(String[] args)
    {
        try
        {
            sum(-3);
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }
}