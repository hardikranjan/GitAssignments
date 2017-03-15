/**
 * Created by hardikranjan on 14/02/17.
 */
import java.util.*;
public class Q5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nQ5-> create a table of a number");
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++)
            System.out.println(n+" * "+i+" = "+(n*i));
    }
}
