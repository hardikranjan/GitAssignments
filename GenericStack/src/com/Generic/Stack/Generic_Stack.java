package com.Generic.Stack;

import java.util.ArrayList;

/**
 * Created by hardikranjan on 25/02/17.
 */

public class Generic_Stack <E>
{

    int size=10,top=-1;
    ArrayList<E> arrayList = new ArrayList<E>();
    boolean isfull()
    {
        if(top==size-1)
            return true;

        return false;
    }
    boolean isempty()
    {
        if(top==-1)
            return true;

        return false;
    }

    void push(E elem)
    {
        if(isfull())
        {
            System.out.println("Stack Is Full");
        }
        else
        {
            top++;
            arrayList.add(elem);
        }
    }
    void pop(E elem)
    {
        if(isempty())
        {
            System.out.println("Stack Is Empty");
        }
        else
        {
            arrayList.remove(top);
            top--;
        }
    }
    public static void main(String[] args)
    {
        Generic_Stack<Integer> genericstack1 = new Generic_Stack<Integer>();
        genericstack1.push(420);
        for(int i: genericstack1.arrayList)
        {
            System.out.println(i);
        }
        Generic_Stack<String> genericstack2 = new Generic_Stack<String>();
        genericstack2.push("hardik");
        for(String j: genericstack2.arrayList)
        {
            System.out.println(j);
        }
    }
}
