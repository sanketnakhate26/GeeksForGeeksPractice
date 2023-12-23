package com.project.tree;

public class ConstructTree {
    static int preIndex = 0;

    public static void main(String args[])
    {
        int[] pre = {10,20,30,40,50};
        int[] in = {20,10,40,30,50};

        int inStart=0;
        int inEnd=pre.length-1;

        Node head = constructTree(pre,in,inStart,inEnd);

        TreeTest.inOrder(head);
    }
    public static Node constructTree(int[] pre, int[] in, int inStart, int inEnd)
    {
        if(inStart>inEnd)
            return null;
        else{
            Node root = new Node(pre[preIndex++]);
            int inIndex=0;
            for(int i=inStart;i<=inEnd;i++)
            {
                if(in[i]==root.data)
                {
                    inIndex=i;
                    break;
                }
            }

            root.left=constructTree(pre,in,inStart,inIndex-1);
            root.right=constructTree(pre,in,inIndex+1,inEnd);
            return root;
        }
    }
}
