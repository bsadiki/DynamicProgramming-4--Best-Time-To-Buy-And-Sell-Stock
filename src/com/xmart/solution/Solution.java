package com.xmart.solution;

public class Solution {
    public static void main(String[] args) {
        int[] values = {7, 1, 5, 4, 6, 4};
        System.out.println(maximumProfit(values, 6));
        int[] values2 = {7, 6, 4, 3, 1};
        System.out.println(maximumProfit(values2, 5));
    }

    private static int maximumProfit(int[] values, int n) {
        if(n == 0 || n == 1)
            return 0;
        int[] minIntoN = new int[n];
        minIntoN[0] = values[0];
        int maxProfit = 0;
        for (int i = 1; i < n; i++) {
            minIntoN[i] = Math.min(minIntoN[i - 1], values[i]);
            maxProfit = Math.max(maxProfit, values[i] - minIntoN[i]);
        }
        return maxProfit;
    }
}