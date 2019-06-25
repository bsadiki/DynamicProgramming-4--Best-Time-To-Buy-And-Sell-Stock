package com.xmart.solution;

public class Solution {
    public static void main(String[] args) {
        int[] values = {7, 1, 5, 4, 6, 4};
        System.out.println(maximumProfit(values, 6));
        int[] values2 = {7, 6, 4, 3, 1};
        System.out.println(maximumProfit(values2, 5));
    }

    private static int maximumProfit(int[] values, int n) {
        if (n == 0) return 0;
        int maxProfit = maximumProfit(values, n - 1);
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, values[n - 1] - values[i]);
        }
        return maxProfit;
    }
}
