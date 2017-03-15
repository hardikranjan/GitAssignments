package AssignmentTwo;

import java.util.Scanner;

/**
 * Created by hardikranjan on 15/02/17.
 */
public class Q8
{
    int a=10,b=20;
    public static void main(String[] args)
    {
        int c=30,d=40;
        Scanner sc = new Scanner(System.in);
        System.out.println("Q8- Write a program explaining state of objects by accessing class and local variables");
        Q8 ob = new Q8();
        System.out.println("Sum(a+c)= " +(ob.a+c));
        System.out.println("Sum(a+b)= " +(ob.a+ob.b));
        System.out.println("Sum(d-b)= " +(d-ob.b));
        System.out.println("Sum(a/b)= " +(ob.a/ob.b));
    }
}
