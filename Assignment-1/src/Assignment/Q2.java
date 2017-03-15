/**
 * Created by hardikranjan on 14/02/17.
 */
import java.util.*;
public class Q2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q2-> Find Largest of three numbers");
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c)
            System.out.println("Largest = "+ a);
        else if(b>a && b>c)
            System.out.println("Largest = "+ b);
        else if(c>a && c>b)
            System.out.println("Largest = "+ c);
        else if(a==b && b==c)
            System.out.println("Equal");
    }
}
