package AssignmentThree.Q2_main;
/**
 * Created by hardikranjan on 17/02/17.
 */
import AssignmentThree.Q2_func.*;
public class Q2Main {
    public static void main(String[] args)
    {
        Q2 q2 = new Q2();

        System.out.println("SUB: "+q2.sub(3,2));
        System.out.println("MUL: "+q2.mul(3,2));
        System.out.println("Div: "+ q2.div(3,2));
        System.out.println("Fact: "+ q2.fact(3));
        System.out.println("Reverse: "+q2.rev(342));

    }
}
