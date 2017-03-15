import java.util.*;
public class Q8
{
    public static int fib(int n)
    {
        if(n==0)
            return 0;
        else if(n<=2)
            return 1;
        else
            return (fib(n-1)+fib(n-2));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A-> Enter the number to print the pattern");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nA-> Enter the number to print the pattern");
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Fibonacci Series:");
        n = sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.print(fib(i)+" ");
        }
    }
}
