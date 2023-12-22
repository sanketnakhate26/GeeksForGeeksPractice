package com.project.stack;

class Stack
{
    int[] data;
    int cap;
    int top;
    Stack(int c)
    {
        top=-1;
        cap=c;
        data=new int[c];
    }
    int push(int value)
    {
        if(top==cap-1)
            return -1;
        else {
            top=top+1;
            data[top] = value;
            return top;
        }
    }
    int pop()
    {
        if(top==-1)
            return -1;
        else{
            int result = data[top];
            top=top-1;
            return result;
        }
    }
    int peek(){
        if(top==-1)
            return -1;
        else
            return data[top];
    }
    public void printStack()
    {
        System.out.print("Stack : ");
        int tempTop=top;
        if(tempTop==-1)
            System.out.println("Stack is empty");
        else
            {
            while (tempTop!=-1)
            {
                System.out.print(data[tempTop--]+" ");
            }
            }
    }
}
public class StackTest {
    public static void main(String args[])
    {
        Stack stack = new Stack(10);
        stack.printStack();
        System.out.println("pushing 10");
        stack.push(10);
        System.out.println("Peek : "+stack.peek());
        System.out.println("pushing 20");
        stack.push(20);
        stack.printStack();
        stack.pop();
        System.out.println("\npop()");
        stack.printStack();

    }
}
