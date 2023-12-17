package com.project.array;

public class TrappingRain {
    public static void main(String args[])
    {
        int[] input = {3, 2, 0, 2, 0, 24};

        System.out.println("Max rain captured : "+maxRainCaptured(input));
    }

    public static int maxRainCaptured(int[] input)
    {
        int maxProfit = 0;
        int len = input.length;
        if(len==1)
            return 0;

        int start = input[0];
        int startPos = 0;
        int blockAge = 0;
        for(int i=1; i<len;i++)
        {
            int blockLength = 0;
            if(i==(len-1)){
                blockLength = Math.min(start,input[i]) > 0 ? Math.min(start,input[i]) : 0;
                int tempProfit = (i-startPos-1)*blockLength - blockAge;
                maxProfit = maxProfit + tempProfit>0 ? tempProfit : 0;
            }
            else if(input[i] == start){
                blockLength = Math.min(start,input[i]) > 0 ? Math.min(start,input[i]) : 0;
                int tempProfit = (i-startPos-1)*blockLength - blockAge;
                maxProfit = maxProfit + tempProfit>0 ? tempProfit : 0;
                blockAge=0;
                startPos=i;
            }else if(input[i] < start){
                blockAge = blockAge + input[i];
            }
            else{
                blockLength = Math.min(start,input[i]) > 0 ? Math.min(start,input[i]) : 0;
                int tempProfit = (i-startPos-1)*blockLength - blockAge;
                maxProfit = maxProfit + tempProfit>0 ? tempProfit : 0;
                blockAge = 0;
                startPos=i;
            }
        }
        return maxProfit;
    }
}
