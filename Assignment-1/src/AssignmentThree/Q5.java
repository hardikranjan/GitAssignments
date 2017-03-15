package AssignmentThree;

/**
 * Created by hardikranjan on 17/02/17.
 */
public class Q5
{
    public static void main(String[] args)
    {
        try
        {
            int num1=30, num2=0;
            try{
                String str=null;
                System.out.println (str.length());
            }catch(Exception e){
                System.out.println(e);
            }
            int output = num1/num2;
            System.out.print(output);
        }
        catch(Exception e)
        {
            System.out.println ("Arithmetic Exception : Divide by 0");
        }
    }
}
