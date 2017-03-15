package AssignmentTwo;

/**
 * Created by hardikranjan on 15/02/17.
 */
class Q17
{
    static int i=0;
    static int k;
    Q17(int k)
    {
        this.k = k;
    }
    void show()
    {
        System.out.println("K: "+ k);
    }
    public static void main(String[] str)
    {
        final int a=10;
        System.out.println("Q17- Write a program which explains static, this and final keywords");
        //Use Of Static Variable
        System.out.print(i+" ");
        i++;
        System.out.println(i);


        //Use of Final Keyword
        System.out.println(a);
        //a++; Cannot change the value of final
        //System.out.println(a);


        //Use of this Keyword
        Q17 obj= new Q17(2);
        obj.show();
    }

}

