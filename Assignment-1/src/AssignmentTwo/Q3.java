package AssignmentTwo;

import java.util.Scanner;

/**
 * Created by hardikranjan on 15/02/17.
 */
public class Q3
{
    int a=110,b=12;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q3-Create an object for a class and access its elements in a java program");
        Q3 ob = new Q3();
        System.out.println("Sum= " +(ob.a+ob.b));
        System.out.println("Sum= " +(ob.a-ob.b));
    }
}
