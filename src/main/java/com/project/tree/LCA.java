package com.project.tree;

public class LCA {
    public static void main(String args[])
    {
        Node tree = new Node(10,new Node(20,new Node(40),new Node(50,new Node(70),new Node(80))),new Node(30,null,new Node(60)));

        int data1=20,data2=30;

        System.out.println(getHeight(tree,data1,data2));

    }
    public static boolean getHeight(Node tree,int data1, int data2)
    {
        if(tree==null)
            return false;
        else if(tree.left.data==data1 && tree.right.data==data2)
            return true;
        else
        {
            boolean left = getHeight(tree.left,data1,data2);
            boolean right = getHeight(tree.right,data1,data2);
            if(left&&right)
                return true;
        }
        return false;
    }

}
