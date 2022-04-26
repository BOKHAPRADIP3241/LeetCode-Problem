package com.company;

import java.util.Arrays;

public class Main {

    int findNumberLIS(int[] arr) {
        int n = arr.length;
        int maxi = 1;
        int[] dp = new int[n];
        int[] cnt = new int[n];

        Arrays.fill(dp,1);
        Arrays.fill(cnt,1);

        for (int i=0; i<n; i++) {
            for (int prev = 0; prev<i;prev++) {
                if (arr[prev] < arr[i] && 1+dp[prev] > dp[i]) {
                    dp[i] = 1 + dp[prev];
                    cnt[i] = cnt[prev];
                }
                else if (arr[prev] < arr[i] && 1+dp[prev] == dp[i]) {
                    cnt[i] += cnt[prev];
                }
            }
            maxi = Math.max(maxi, dp[i]);
        }

        int nos = 0;
        for (int i = 0; i<n; i++) {
            if (dp[i] == maxi) nos += cnt[i];
        }
        return nos;
    }

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,5,4,3,2,6,7,10,8,9};
        Main m = new Main();
        int res = m.findNumberLIS(arr);
        System.out.println(res);
    }
}
