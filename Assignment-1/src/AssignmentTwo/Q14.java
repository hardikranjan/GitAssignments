package AssignmentTwo;

import java.util.Scanner;

/**
 * Created by hardikranjan on 15/02/17.
 */

class A
{
    A()
    {
        System.out.println("Constructor of A class");
    }
}

class B extends A
{
    B()
    {
        System.out.println("Constructor of B class");
    }
}

class C extends B
{
    C()
    {
        System.out.println("Constructor of C class");
    }
}
class Q14
{
    public static void main(String[] args)
    {
        System.out.println("Q14- Write a program to understand constructor inheritance");
        C p = new C();
    }
}

