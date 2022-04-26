package com.company;

public class Main {
     public void nextPermutation(int[] nums){
         int n = nums.length;
         int i = nums.length - 2;
         if (nums.length == 0 || nums.length <= 1) return;

         while (i >= 0 && nums[i] >= nums[i+1]) i--;
         if (i>=0) {
             int j = nums.length - 1;
             while (nums[j] <= nums[i]) j--;
             swap(nums, i, j);
         }
         reverse(nums, i+1, nums.length-1);
//
     }

     public void swap (int nums[], int i, int j) {
         int tmp = nums[i];
         nums[i] = nums[j];
         nums[j] = tmp;
     }

     public void reverse(int nums[], int i, int j) {
         while (i < j) swap(nums, i++, j--);
     }

    public static void main(String[] args) {
	// write your code here
        int nums[] = {1,3,5,4,2};
        Main m = new Main();
        m.nextPermutation(nums);
        for (int i = 0; i<nums.length;i++) {
            System.out.print(nums[i]);
        }
    }
}
