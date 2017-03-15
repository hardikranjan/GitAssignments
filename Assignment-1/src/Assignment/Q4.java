/**
 * Created by hardikranjan on 14/02/17.
 */
import java.util.*;
public class Q4 {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nQ4-> Display Odd numbers between x and y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i=x;i<=y;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+ " ");
            }
        }
    }
}
