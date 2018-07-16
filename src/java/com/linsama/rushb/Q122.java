package com.linsama.rushb;

import java.util.ArrayList;
import java.util.List;

public class Q122 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int sum = 0;
        int curBought = prices[0];
        int curSell = prices[0];
        for (int price : prices) {
            if (price > curSell) {
                curSell = price;
                continue;
            } else if (price < curSell) {
                sum += curSell - curBought;
                curBought = price;
                curSell = price;
            }
        }
        sum = curBought == curSell ? sum : sum + curSell - curBought;
        return sum;
    }
}
