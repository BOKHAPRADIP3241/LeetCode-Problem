package com.company;

import java.util.ArrayList;
import java.util.Arrays;



    public class Job {
        char id;
        int profit;
        int deadline;
        public Job() {}

        public Job(char id,int x,int y) {
            this.id = id;
            this.profit = x;
           this.deadline = y;
        }
    

    public static int[] jobScheduling(Job[] arr, int n) {
        Arrays.sort(arr, (a,b) -> (b.profit - a.profit));

        int maxi = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].deadline > maxi) {
                maxi = arr[i].deadline;
            }
        }

        int result[] = new int[maxi + 1];
        for (int i = 1; i <= maxi; i++) {
            result[i] = -1;
        }

        int countJob = 0, jobProfit = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i].deadline; j > 0; j--) {
                if (result[j] == -1) {
                    result[j] = i;
                    countJob++;
                    jobProfit += arr[i].profit;
                    break;
                }
            }
        }

        int ans[] = new int[2];
        ans[0] = countJob;
        ans[1] = jobProfit;
        return ans;
    }

    public static void main(String[] args) {
	// write your code here
        Job[] arr = {{'a',2,100},};
    }
}
