package com.company;

import java.util.Arrays;

public class Main {

    public void sortColor(int[] nums){
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int temp;

        while(mid<=high) {
            switch (nums[mid]) {
                case 0: {
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        Main obj = new Main();
        int[] nums = {0,1,2,1,0,2};
        Arrays.sort(nums);
        obj.sortColor(nums);
        for (int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
