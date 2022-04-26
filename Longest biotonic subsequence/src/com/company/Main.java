package com.company;

import java.util.Arrays;

public class Main {

    int longestBitonic(int[] arr, int n) {
        int[] dp1 = new int[n];
        Arrays.fill(dp1, 1);

        for (int i = 0; i<n; i++) {
            for (int prev = 0; prev < i; prev++) {
                if (arr[prev] < arr[i] && 1 + dp1[prev] > dp1[i]) {
                    dp1[i] = 1 + dp1[prev];

                }
            }
        }
        int maxi = 0;

        int[] dp2 = new int[n];
        Arrays.fill(dp2, 1);

        for (int i = n-1; i>=0; i--) {
            for (int prev = n-1; prev > i; prev--) {
                if (arr[prev] < arr[i] && 1 + dp2[prev] > dp2[i]) {
                    dp2[i] = 1 + dp2[prev];

                }
            }
            maxi = Math.max(maxi, dp1[i] + dp2[i] -1);
        }
        return maxi;

    }

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,11,2,10,4,5,2,1};
        int n = arr.length;

        Main m = new Main();
        int res = m.longestBitonic(arr, n);
        System.out.println(res);
    }
}
