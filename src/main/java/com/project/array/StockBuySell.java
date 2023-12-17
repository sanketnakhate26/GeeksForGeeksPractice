package com.project.array;

public class StockBuySell {
    public static void main(String args[])
    {
        int[] input = {1,5,3,8,12};

        System.out.println("Max profit : "+getProfit(input));

    }
    public static int getProfit(int[] input)
    {
        int profit =0;

        for(int i=1;i<input.length;i++)
        {
            if(input[i] > input[i-1])
                profit+=(input[i]-input[i-1]);
        }
        return profit;
    }
}
