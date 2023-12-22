package com.project.stack;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayDeque;
import java.util.Iterator;

public class StockSpan {
    public static void main(String args[])
    {
        int[] input = {60,10,20,15,35,50};

        printSpan(input);
    }
    public static void printSpan(int[] input)
    {
       ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
       arrayDeque.push(0);
       System.out.print(arrayDeque.peek()+1+" ");

        for(int i=1;i<input.length;i++)
        {
            while (!arrayDeque.isEmpty() && input[arrayDeque.peek()] <= input[i])
            {
                arrayDeque.pop();
            }

            int span = arrayDeque.isEmpty()?i+1:i-arrayDeque.peek();
            System.out.println(span+" ");
            arrayDeque.push(i);
//            if(arrayDeque.isEmpty())
//            {
////                System.out.println("if for i="+i);
//                System.out.print(i+1+" ");
//                arrayDeque.push(i);
//            }
//            else{
////                System.out.println("else for i="+i);
//                System.out.print(i-arrayDeque.peek()+" ");
//                arrayDeque.push(i);
//            }

//            System.out.print("Stack : ");
//            Iterator<Integer> it = arrayDeque.iterator();
//            while (it.hasNext())
//                System.out.print(it.next()+" ");
//            System.out.println("\ni = "+i+" Span = "+span);
        }




    }
}
