package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static int longestConsecutive(int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums){
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : nums){
             if (! set.contains(num - 1)){

                 int currentNum = num;
                 int currentStreak = 1;
                 while (set.contains(currentNum + 1)){
                     currentNum += 1;
                     currentStreak += 1;
                 }
                 longestStreak = Math.max(longestStreak , currentStreak);

             }
        }
        return longestStreak;

    }

    public static void main(String[] args) {
	// write your code here

        int[] nums = {2,5,6,7,100,101,102,1,3,4,103,104};
        System.out.println(longestConsecutive(nums));
    }
}
