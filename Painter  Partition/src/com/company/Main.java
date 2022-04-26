package com.company;

public class Main {

    boolean isPossible(int[] board, int k, int mid, int m) {
        int painterCount = 1;
        int boardSum = 0;

        for (int i = 0; i < board.length; i++) {
            if (boardSum + board[i] <= mid) {
                boardSum += board[i];
            } else {
                painterCount++;
                if (painterCount > k || board[i] > mid) {
                    return false;
                }
                boardSum = board[i];
            }
        }
        return true;


    }


    public int painterPartition(int[] nums, int k) {
        int n = nums.length;
        int s = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int e = sum;
        int ans = -1;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            if (isPossible(nums, k, mid, n)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            mid = s + (e - s) / 2;

        }
        return ans;
    }

    public static void main(String[] args) {
        // write your code here
        int[] board = {5,5,5,5};
        int k = 2;
        Main m = new Main();


        int res =m.painterPartition(board, k);
        System.out.println(res);
    }
}
