package com.linsama.rushb;

public class Q45 {
    public int jump(int[] nums) {
        int steps = 0, curEnd = 0, maxLength = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxLength = Math.max(maxLength, nums[i] + i);
            if (i == curEnd) {
                steps++;
                curEnd = maxLength;
            }
        }
        return steps;
    }
}
