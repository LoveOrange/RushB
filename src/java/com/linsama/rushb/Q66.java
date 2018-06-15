package com.linsama.rushb;

public class Q66 {
    public int[] plusOne(int[] digits) {
        int tmp = 1;
        for (int i = digits.length - 1; i > -1; i--) {
            digits[i] = digits[i] + tmp;
            if (digits[i] < 10) {
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] ret = new int[digits.length + 1];
        ret[0] = 1;
        for (int i = 1; i < ret.length; i++) {
            ret[i] = digits[i - 1];
        }
        return ret;
    }
}
