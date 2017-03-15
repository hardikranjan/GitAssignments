package AssignmentTwo;

import java.util.Scanner;

/**
 * Created by hardikranjan on 15/02/17.
 */
public class Q10
{
    Q10()
    {
        System.out.println("Default Constructor");
    }
    Q10(int n,int m)
    {
        System.out.println("Value Of N: "+ n);
        System.out.println("Value Of M: "+ m);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q10- Write a program to explore constructor with parameters");
        Q10 obj = new Q10();
        Q10 obj1 = new Q10(20,50); // Paramaterised Constructor

    }
}
