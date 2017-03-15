package AssignmentTwo;

import java.util.Scanner;

/**
 * Created by hardikranjan on 15/02/17.
 */
public class Q9
{
    Q9()
    {
        System.out.println("Default Constructor");
    }
    Q9(int n)
    {
        System.out.println("Value Of N: "+ n);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q9- Write a program to access constructor of java");
        Q9 obj = new Q9();
        Q9 obj1 = new Q9(20);

    }
}
