package AssignmentTwo;

import java.util.Scanner;

/**
 * Created by hardikranjan on 15/02/17.
 */
public class Q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q2-Create a Two Dimensional array and iterate it using inner & outer for loop");
        int[][] a = new int[2][3];
        System.out.println("Enter elements of array");
        for(int i=0;i<2;i++)
            for(int j=0;j<3;j++)
                a[i][j]=sc.nextInt();

        for(int[] i:a)
            for(int j:i)
                System.out.println(j);


    }
}
