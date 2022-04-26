package com.company;

import java.util.Arrays;

public class Main {

    public int f(int i, int j, int arr[], int dp[][]) {

        if (i>j) return 0;
        int maxi  = Integer.MAX_VALUE;
        if (dp[i][j] != -1) return dp[i][j];
        for (int ind = i; ind <= j;ind++) {
            int cost = arr[i-1]*arr[ind]*arr[j+1] + f(i, ind-1, arr, dp) + f(ind +1, j, arr, dp);
            maxi = Math.max(maxi, cost);
        }
        return dp[i][j] = maxi;

    }

    public int maxCoins(int arr[]) {
        int n = arr.length;
        arr[0] = 1;
        arr[n+1] = 1;
        for (int i = 0; i < n; i++) {
            arr[i+1] =arr[i];
        }

        int dp[][] = new int[n+1][n+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return f(1,n,arr,dp);
    }

    public static void main(String[] args) {
	// write your code here
        int n = 4;
        int[] arr = {3,1,5,8};


        Main m = new Main();
        int res = m.maxCoins(arr);
        System.out.println(res);
    }
}
