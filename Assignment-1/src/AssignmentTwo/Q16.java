package AssignmentTwo;

/**
 * Created by hardikranjan on 15/02/17.
 */
abstract class abc
{
     abstract void display();
}
class Q16 extends abc
{
    void display()
    {
        System.out.println("Hello Welcome");
    }
    public static void main(String[] str)
    {
        System.out.println("Q16- Write a program to understand abstract classes");
        Q16  ob = new Q16();
        ob.display();
    }
}
