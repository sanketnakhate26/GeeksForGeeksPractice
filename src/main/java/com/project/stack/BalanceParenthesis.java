package com.project.stack;

import java.util.ArrayDeque;
import java.util.HashMap;

public class BalanceParenthesis {
    public static void main(String args[])
    {
        String str = "{{[()]}}";

        System.out.println("Is "+str+" is balanced : "+isBalance(str));
    }
    public static boolean isBalance(String str)
    {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        HashMap<Character,Integer> open = new HashMap<>();
        open.put('{',1);
        open.put('[',2);
        open.put('(',3);

        HashMap<Character,Integer> close = new HashMap<>();
        close.put('}',1);
        close.put(']',2);
        close.put(')',3);


        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(open.containsKey(ch))
                arrayDeque.push(open.get(ch));
            else{
                if(close.get(ch)!=arrayDeque.peek())
                    return false;
                else
                    arrayDeque.pop();
            }
        }
        return arrayDeque.isEmpty()?true:false;
    }
}
