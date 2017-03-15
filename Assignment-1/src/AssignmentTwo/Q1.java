package AssignmentTwo;
/**
 * Created by hardikranjan on 15/02/17.
 */

import java.util.*;
public class Q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q1- Create a Single Dimensional array and iterate it using for loop");
        int[] a = new int[5];
        System.out.println("Enter elements of array");
        for(int i=0;i<5;i++)
            a[i]=sc.nextInt();

        for(int i:a)
            System.out.println(i);

    }
}
