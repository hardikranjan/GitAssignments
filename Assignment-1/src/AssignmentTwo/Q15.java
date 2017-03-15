package AssignmentTwo;

/**
 * Created by hardikranjan on 15/02/17.
 */

class K
{
    K()
    {
        System.out.println("Constructor of K class");
    }
    void display()
    {
        System.out.println("Display K");
    }
}

class M extends K
{
    M()
    {
        System.out.println("Constructor of M class");
    }
    void display()
    {
        System.out.println("Display M");
    }
}
public class Q15 {
    public static void main(String[] args) {
        System.out.println("Q14- Write a program which explains method overriding");
        M p = new M();
        p.display();
    }
}