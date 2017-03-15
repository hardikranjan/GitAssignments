package AssignmentThree;

import java.util.Scanner;

/**
 * Created by hardikranjan on 17/02/17.
 */

import java.util.*;
interface queue
{
    void insert(int x);
    void delete();
}
public class Q1 implements queue
{
    static Queue q1 = new LinkedList();

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q1 ob = new Q1();
        ob.insert(10);
        System.out.println(q1);
        ob.insert(20);
        System.out.println(q1);
        ob.delete();
        System.out.println(q1);
    }

    @Override
    public void insert(int x)
    {
        q1.add(x);
    }

    @Override
    public void delete()
    {
        q1.remove();
    }
}
