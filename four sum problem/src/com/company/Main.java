package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<List<Integer>> fourSum(int[] num, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = num.length;
        Arrays.sort(num);
        for (int i = 0; i < n; i++) {
           // int tar = target - num[i];
            for (int j  = i + 1; j < n; j++) {
                int target_2 = target - num[j] - num[i];
                int front = j+1;
                int back = n-1;

                while (front < back) {
                    int two_sum = num[front] + num[back];
                    if (two_sum < target_2) front++;
                    else if(two_sum > target_2) back--;
                    else {
                        List<Integer> list = new ArrayList<>();
                        list.add(num[i]);
                        list.add(num[j]);
                        list.add(num[front]);
                        list.add(num[back]);
                        res.add(list);

                        while(front < back && num[front] == list.get(2)) ++front;
                        while(front < back && num[back] == list.get(3)) --back;
                    }

                }

                while (j + 1 < n && num[j+1] == num[j]) ++j;
                while (i + 1 < n && num[i+1] == num[i]) ++i;
            }
        }
        return res;

    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> li = fourSum(arr,target);
        for (int i = 0; i < li.size(); i++) {
            for (int j = 0; j < li.get(i).size(); j++) {
                System.out.print(li.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
