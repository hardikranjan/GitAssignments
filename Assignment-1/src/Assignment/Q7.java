/**
 * Created by hardikranjan on 14/02/17.
 */
import java.util.*;
public class Q7
{
    public static int reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int b=n%10;
            rev = rev*10 + b;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s[] = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        System.out.println("Enter a number");
        int n = sc.nextInt();
        n = reverse(n);
        while(n!=0)
        {
            int a = n%10;
            System.out.print(s[a]+" ");
            n = n/10;
        }
    }
}
