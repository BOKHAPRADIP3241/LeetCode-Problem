package com.company;

public class Main {
    public int f(int ind, int W, int[] wt, int[] val, int[][] dp) {
        if (ind == 0) {
            if (wt[0] <= W) return val[0];
            else return 0;
        }
            if (dp[ind][W] != -1) return dp[ind][W];
            int notTake = 0 + f(ind-1, W, wt,val,dp);
            int take = Integer.MIN_VALUE;
            if (wt[ind] <= W) take = val[ind] + f(ind-1, W - wt[ind], wt, val, dp);

         return dp[ind][W] = Math.max(notTake, take);

    }

    public int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        int[][] dp = new int[n][maxWeight];
        return f(n-1,maxWeight,weight, value,dp);
    }
    public static void main(String[] args) {
	// write your code here
        int[] weight = {1,2,3};
        int[] value = {30,20,10};
        int W = 2;
        Main M = new Main();
        int res = M.knapsack(weight,value, weight.length, W);
        System.out.println(res);
    }
}
