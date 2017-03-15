package AssignmentThree;

/**
 * Created by hardikranjan on 17/02/17.
 */
public class Q6
{
    public static void div(int x,int y)
    {
        try
        {
            int res = x/y;
        }
        catch(Exception e)
        {
            System.out.println("Inner Try Block"+ e);
        }
    }
    public static void main(String[] args)
    {
        try
        {
             div(10,0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
