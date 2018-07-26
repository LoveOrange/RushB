package com.linsama.rushb;

public class Q8 {
    public int myAtoi(String str) {
        boolean flag = true;
        boolean start = false;
        int ret = 0;
        char cur;
        for (int i = 0; i < str.length(); i++) {
            cur = str.charAt(i);
            if (!start && ' ' == cur) {
                continue;
            }
            if (!start && '-' == cur) {
                flag = false;
                start = true;
                continue;
            } else if (!start && '+' == cur) {
                start = true;
                continue;
            }
            start = true;
            if (cur < '0' || cur > '9') {
                break;
            }
            if (ret <= (Integer.MAX_VALUE -  (cur - '0')) / 10) {
                ret = 10 * ret + cur - '0';
            } else {
                return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        return flag ? ret : -1 * ret;
    }

    public static void main(String[] args) {
        System.out.println(new Q8().myAtoi("4193 with words"));
    }
}
