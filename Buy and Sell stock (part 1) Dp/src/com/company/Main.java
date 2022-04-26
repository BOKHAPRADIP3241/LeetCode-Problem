package com.company;

public class Main {
    public int buyStock(int[] price) {
        int mini = price[0];
        int maxProfit = 0;
        int n = price.length;

        for (int i = 0; i < n; i++) {
            int cost = price[i] - mini;
            maxProfit = Math.max(maxProfit, cost);
            mini = Math.min(mini, price[i]);
        }
        return maxProfit;

    }


    public static void main(String[] args) {
	// write your code here
        int[] price = {1,2,3,5,6,7};
        Main m = new Main();
        int res = m.buyStock(price);
        System.out.println(res);
    }
}
