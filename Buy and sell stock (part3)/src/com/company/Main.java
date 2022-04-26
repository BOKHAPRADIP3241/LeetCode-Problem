package com.company;

// we can at most two transaction

import java.util.Arrays;

public class Main {

    public int f(int ind, int buy, int cap, int[] price, int n, int[][][] dp) {
        if (ind == n) return 0;
        if(cap == 0) return 0;

        if (dp[ind][buy][cap] != -1) return dp[ind][buy][cap];

        if (buy ==1 ){
            return dp[ind][buy][cap] = Math.max(-price[ind] + f(ind+1, 0,cap,price, n,dp),
                    0 + f(ind+1, 1, cap, price, n,dp));
        }
        else {
            return dp[ind][buy][cap] = Math.max(price[ind] + f(ind+1, 1, cap-1, price, n ,dp),
                    0 + f(ind +1, 0,cap,price, n, dp));
        }

    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][2][3];
        for (int[][] row : dp) {
            for (int[] ra : row) {
                Arrays.fill(ra, -1);
            }
        }
        return f(0,1,2,prices,n,dp);



    }


    public static void main(String[] args) {
	// write your code here
        int[] price = {4,9,0,4,10};
        Main m = new Main();
        int result = m.maxProfit(price);
        System.out.println(result);
    }
}
