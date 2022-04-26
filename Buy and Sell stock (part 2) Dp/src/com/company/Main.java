package com.company;

import java.util.Arrays;

public class Main {

    public long f(int ind, int buy, long[] price,int n, long[][] dp) {
        long profit = 0;

        if (ind == n) return 0;
        if (dp[ind][buy] != -1) return dp[ind][buy];

        if (buy == 1) {
            profit = Math.max(-price[ind] + f(ind + 1, 0, price,n, dp),0 + f(ind + 1, 1, price, n, dp));

        }
        else {

            profit = Math.max(price[ind] + f(ind + 1, 1, price, n, dp), 0 + f(ind + 1, 0, price, n, dp));

        }
        return dp[ind][buy] = profit;


    }

    public long maxProfit(long[] price, int n) {
        long[][] dp = new long[n][2];

        for (long[] row : dp) {
            Arrays.fill(row, -1);
        }
        return f(0, 1, price, n,  dp);
    }

    public static void main(String[] args) {
	// write your code here
        long[] price = {7,1,5,3,6,4};
        int n = price.length;
        Main m = new Main();
        long result = m.maxProfit(price, n);
        System.out.println(result);
    }
}
