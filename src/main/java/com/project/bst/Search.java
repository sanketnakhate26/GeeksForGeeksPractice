package com.project.bst;

class TreeNode
{
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int value)
    {
        this.value=value;
    }
    TreeNode(int value, TreeNode left, TreeNode right)
    {
        this.value=value;
        this.left=left;
        this.right=right;
    }
}


public class Search {
    public static void main(String args[])
    {
        TreeNode root = new TreeNode(15,new TreeNode(5,new TreeNode(3),null),new TreeNode(20,new TreeNode(18,new TreeNode(16),null),new TreeNode(80)));
        int target = 31;

        System.out.println("Is "+target+" present : "+search(root,target));
    }
    public static boolean search(TreeNode root, int target)
    {
        if(root==null)
            return false;
        else{
            if(root.value==target)
                return true;
            else if(root.value>target)
                return search(root.left,target);
            else
                return search(root.right,target);
        }
    }
}
