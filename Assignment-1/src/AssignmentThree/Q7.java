package AssignmentThree;

/**
 * Created by hardikranjan on 17/02/17.
 */
public class Q7
{
        public static void main(String[] args)
        {
            try
            {
                System.out.println("This is try block");
            }
            catch (Exception e)
            {
                System.out.println("Exception in catch block"+ e);
            }
            finally {
                System.out.println("Finally Executed");
            }
        }
}
