package AssignmentTwo;

import java.util.Scanner;

/**
 * Created by hardikranjan on 15/02/17.
 */
public class Q13
{
    Q13()
    {
        System.out.println("In Base Constructor");
    }

}


class Inherited_Q13
{
    Inherited_Q13()
    {
        System.out.println("In Derived Constructor");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q13- Write a program to understand super class");
        Inherited_Q12 obj = new Inherited_Q12();
    }

}
