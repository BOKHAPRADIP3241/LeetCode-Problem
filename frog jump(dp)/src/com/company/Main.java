package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] heights = {30,10,60,10,60,50};
        int n = heights.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        //int prev = 0;
        //int prev2 = 0;
        for (int i = 1; i < n; i++) {
           // int jumpOne = prev + Math.abs(heights[i] - heights[i-1]);
            int jumpOne = dp[i-1] + Math.abs(heights[i]-heights[i-1]);
            int jumpTwo = Integer.MAX_VALUE;
            if (i > 1) {
                //jumpTwo = prev2 + Math.abs(heights[i]-heights[i-2]);
                jumpTwo = dp[i-2] + Math.abs(heights[i]-heights[i-2]);
            }

            //int cur = Math.min(jumpOne, jumpTwo);
            dp[i] = Math.min(jumpOne, jumpTwo);

           // prev2 = prev;
            //prev = cur;
        }

        System.out.println(dp[n-1]);
    }
}
