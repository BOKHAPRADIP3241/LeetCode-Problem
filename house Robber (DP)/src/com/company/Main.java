package com.company;

public class Main {

    int maximumNonAdjanceSum(int[] nums) {
        int n = nums.length;
        // int dp[] = new int[n];
        //Arrays.fill(dp, -1);
        //return f(n-1,nums, dp);

        int prev = nums[0];
        int prev2 = 0;

        for (int i = 1; i < n; i++) {
            int take = nums[i];

            if (i > 1) take += prev2;

            int notTake = 0 + prev;

            int curr = Math.max(take, notTake);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

    public long houseRobber (int[] valueInHouse) {
        int n = valueInHouse.length;
        int[] temp1 = new int[n];
        int[] temp2 = new int[n];

        if (n == 1) return valueInHouse[0];

        for (int i = 0; i < n; i++) {
            if (i != 0)
                temp1[i] = valueInHouse[i];

            if (i != n - 1)
                temp2[i] = valueInHouse[i];

        }
        return Math.max(maximumNonAdjanceSum(temp1), maximumNonAdjanceSum(temp2));

    }

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1,3,2,1};
        Main m = new Main();
        long ans = m.houseRobber(nums);
        System.out.println(ans);
    }
}
