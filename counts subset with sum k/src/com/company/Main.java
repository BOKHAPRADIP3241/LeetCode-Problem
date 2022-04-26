package com.company;

import java.util.Arrays;

public class Main {

     public boolean f(int ind , int sum, int[]nums, int[][] dp) {
         if (sum == 0) return true;
         if(ind == 0) return nums[0] == sum;

         if (dp[ind][sum] != -1) return dp[ind][sum];
         boolean notTake = f(ind-1, sum,nums,dp);
         boolean take = false;
         if (nums[ind] <= sum) take =f(ind-1,sum-nums[ind],nums,dp);

         return dp[ind][sum] = take  notTake;
     }

     boolean findWays(int[] nums, int tar) {
         int n = nums.length;
         int[][] dp = new int[n][tar+1];
         for (int[] row :dp) {
             Arrays.fill(row,-1);
         }
         return f(n-1,tar,nums,dp);
     }

    //tabulation code for remove recursion stack space

//    int findWays(int[] nums, int tar) {
//         int n = nums.length;
//         int[][] dp = new int[n][tar+1];
//         for (int[] row :dp) {
//             Arrays.fill(row,0);
//         }
//         for (int i = 0; i< n;i++) dp[i][0] = 1;
//         if (nums[0] <= tar) dp[0][nums[0]] = 1;
//
//         for (int ind = 1; ind < n; ind++) {
//             for (int sum = 0; sum <= tar; sum++) {
//                 int notTake = dp[ind-1][sum];
//                 int take = 0;
//                 if (nums[ind] <= sum) take =dp[ind-1][sum-nums[ind]];
//
//                  dp[ind][sum] = take + notTake;
//
//             }
//         }
//         return dp[n-1][tar];
//
//     }

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1,1,1};
        int sum = 2;
        Main m = new Main();
        int res = m.findWays(nums,sum);
        System.out.println(res);
    }
}
