package com.company;

import java.util.Arrays;

public class Main {
    public int f(int ind, int tranNo, int k, int[] price, int n, int[][]dp) {
        if (ind == n) return 0;
        if (tranNo == 2*k) return 0;

        if (dp[ind][tranNo] != -1) return dp[ind][tranNo];

        if (tranNo % 2 == 0)  { //buy
            return dp[ind][tranNo]= Math.max(-price[ind] + f(ind + 1, tranNo+1 , k , price, n, dp),
                    0 + f(ind + 1, tranNo, k , price, n, dp));
        } else {
            return dp[ind][tranNo] = Math.max(price[ind] + f(ind + 1, tranNo + 1, k - 1, price, n, dp),
                    0 + f(ind + 1, tranNo, k, price, n, dp));
        }
    }

    public int maxProfit(int k, int[] prices, int n) {
        int[][] dp = new int[n][2*k];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return f(0,0,k,prices,n,dp);


    }


    public static void main(String[] args) {
	// write your code here
        int[] price = {3,2,6,5,0,3};
        int k =2;
        int n = price.length;
        Main m = new Main();
        int ans = m.maxProfit(k,price,n);
        System.out.println(ans);
    }
}
