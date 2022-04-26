package com.company;

import java.util.Arrays;

public class Main {

    boolean checkPossible(String s1, String s2) {

    }

    int longestStrChain(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int maxi = 1;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 0; i < n; i++) {
            for (int prev =  0; prev < i; prev++) {
                if (checkPossible(arr[i], arr[prev]) && 1 + dp[prev] > dp[i]) {
                    dp[i] = 1 + dp[prev];
                }
            }
            if (dp[i] > maxi) {
                maxi = dp[i];
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
