package AssignmentThree.Q2_func;

/**
 * Created by hardikranjan on 17/02/17.
 */
public class Q2
{
    public int sub(int x,int y)
    {
        return (x-y);
    }
    public int mul(int x,int y)
    {
        return (x*y);
    }
    public int div(int x,int y)
    {
        int z=0;
        try {
            z = x / y;
        }
        catch(Exception e)
        {
            System.out.println("Divided By Zero Exception");
        }
        return z;
    }
    public int fact(int x)
    {
        int fact = 1;
        while(x!=0)
        {
            fact = fact * x;
            x--;
        }
        return fact;
    }
    public int rev(int x)
    {
        int r=0;
        while(x!=0)
        {
            int y = x%10;
            r = r*10 + y;
            x = x/10;
        }
        return r;
    }
}
