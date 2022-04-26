package com.company;

public class Main {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];

        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (nums1[i] == nums2[j]) {
                ans[i] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
	// write your code here
        int[] nums1 ={1,2,2,1};
        int[] nums2 = {2,2};

        int res = intersection(nums1, nums2);
        System.out.println(res);
    }
}
