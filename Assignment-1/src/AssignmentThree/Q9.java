package AssignmentThree;

/**
 * Created by hardikranjan on 17/02/17.
 */
public class Q9 extends Thread
{
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<5;i++)
        {
            System.out.print(i+" ");
            Thread.sleep(1000);
        }
    }
}
