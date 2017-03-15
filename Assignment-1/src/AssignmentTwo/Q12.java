package AssignmentTwo;

import java.util.Scanner;

/**
 * Created by hardikranjan on 15/02/17.
 */


import java.util.Scanner;

/**
 * Created by hardikranjan on 15/02/17.
 */

public class Q12
{
    Q12()
    {
        System.out.println("In Base Constructor");
    }
}
class Inherited_Q12 extends Q12
{
    Inherited_Q12()
    {
        System.out.println("In Derived Constructor");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q12- Write a program which explains class inheritance");
        //System.out.println("Q12- Inherited Class of Q12");
        System.out.println("In main() of Inherited class");
        Inherited_Q12 obj = new Inherited_Q12();
    }
}
