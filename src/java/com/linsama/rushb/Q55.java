package com.linsama.rushb;

public class Q55 {
    public boolean canJump(int[] nums) {
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            maxLength = Math.max(maxLength, nums[i] + i);
            if (maxLength == i && i < nums.length - 1) {
                return false;
            }
        }
        return true;
    }
}
