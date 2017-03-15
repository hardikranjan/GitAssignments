/**
 * Created by hardikranjan on 14/02/17.
 */
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q6-> Reverse  a number");
        int n = sc.nextInt();
        int rev = 0;
        //System.out.println(n);
        while(n!=0)
        {
            int b=n%10;
            rev = rev*10 + b;
            n = n/10;
        }
        System.out.println(rev);

    }
}
