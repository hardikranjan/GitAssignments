package AssignmentThree;

/**
 * Created by hardikranjan on 17/02/17.
 */
public class Q8
{
    public static void main(String[] args)
    {
        int number = 10;
        try
        {
            if(number<20)
                throw new Exception("Throws Executed 1");
            else
                throw new Exception("Throws Executed 2");
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}
