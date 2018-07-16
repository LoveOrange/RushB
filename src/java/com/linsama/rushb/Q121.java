package com.linsama.rushb;

import java.util.Stack;

public class Q121 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int curMin = prices[0];
        for (int price : prices) {
            if (price < curMin) {
                curMin = price;
                continue;
            } else {
                if (price - curMin > maxProfit) {
                    maxProfit = price - curMin;
                }
            }
        }
        return maxProfit;
    }
}
