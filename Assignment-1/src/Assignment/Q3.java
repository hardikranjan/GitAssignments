/**
 * Created by hardikranjan on 14/02/17.
 */
public class Q3 {
    public static void main(String[] args)
    {
        System.out.println("Q3-> Display 1st 20 even numbers");
        int count=0,i=1;
        while(count<=20)
        {
            if((i)%2==0)
            {
                System.out.print(i +" ");
                count++;
            }
            i++;
        }
    }
}
