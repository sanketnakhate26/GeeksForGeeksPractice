package com.project.bst;

public class Delete {
    public static void main(String args[])
    {
        TreeNode root = null;
        root = Insert.insert(root, 10);
        root = Insert.insert(root, 20);
        root = Insert.insert(root, 11);
        root = Insert.insert(root, 22);
        root = Insert.insert(root, 6);
        root = Insert.insert(root, 4);
        root = Insert.insert(root, 8);


        System.out.print("\nOriginal : ");
        Insert.printInOrder(root);
        int target = 22;
        root = delete(root,target);
        System.out.print("\n After Delete : ");
        Insert.printInOrder(root);
    }
    public static TreeNode delete(TreeNode root, int target)
    {
        if(root==null)
            return null;
        else if(root.value>target)
            root.left=delete(root.left,target);
        else if(root.value<target)
            root.right=delete(root.right,target);
        else{
            if(root.right==null)
                return root.left;
            else if(root.left==null)
                return root.right;
            else{
                TreeNode succ = getSucc(root);
                root.value=succ.value;
                root.right=delete(root.right,succ.value);
            }
            return root;
        }
        return root;
    }
    public static TreeNode getSucc(TreeNode root)
    {
        TreeNode curr = root.right;
        while (curr!=null && curr.left!=null)
            curr=curr.left;
        return curr;
    }
}
