package AssignmentTwo;

import java.util.Scanner;

/**
 * Created by hardikranjan on 15/02/17.
 */
public class Q11
{
    static int n;
    Q11() {
        n=10;
    }

    Q11(int a) {
        n = a;
    }
    public static void display()
    {
        System.out.println("Value of N: " + n);
    }
    public static void main(String[] args)
    {
        System.out.println("Q11- Write a program which explains constructor overloading");
        Q11 obj = new Q11();
        obj.display();
        Q11 obj1 = new Q11(20);

        obj1.display();
    }
}