package AssignmentThree;

/**
 * Created by hardikranjan on 17/02/17.
 */
public class Q4 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("5 * " + i +" = " + (5*i));
        }
    }
    public static void main(String[] args) throws Exception
    {
        Q4 t1 = new Q4();
        t1.start();
        System.out.println("Curent Thread: " + Thread.currentThread().getName());

        for(int i=2;i<=40;i=i+2)
        {
            System.out.println("Even: "+i);
        }
    }
}
