package Assignment; /**
 * Created by hardikranjan on 14/02/17.
 */
import java.util.Scanner;
public class Assignment
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Q1- Find Largest of two numbers");
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b)
            System.out.println("Largest = "+ a);
        else if(a<b)
            System.out.println("Largest = "+ b);
        else
            System.out.println("Equal");


    }
}
