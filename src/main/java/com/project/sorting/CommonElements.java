package com.project.sorting;

public class CommonElements {
    public static void main(String args[])
    {
        int[] a = {2,2,3,5,7,9,9,9,11};
        int[] b = {3,5,9,9,9,15,18};

        findCommon(a,b);
    }

    public static void findCommon(int[] a, int[] b)
    {
        int n1 = a.length;
        int n2 = a.length;
        int i=0,j=0;
        while (i<n1 && j<n2){
            if(a[i]==b[j]){
                System.out.println(a[i]+" ");
                i++;
                j++;
                while (a[i]==a[i-1])
                    i++;
                while (b[j]==b[j-1])
                    j++;
            }
            else if(a[i]<b[j])
                i++;
            else
                j++;
        }
    }
}
