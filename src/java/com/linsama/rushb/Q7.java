package com.linsama.rushb;

public class Q7 {
    public int reverse(int x) {
        int ret = 0;
        int cur;
        int flag = 1;
        if (x < 0) {
            flag = -1;
            x = flag * x;
        }
        while (x != 0) {
            cur = x % 10;
            if (ret < (0x7fffffff - cur) / 10) {
                return 0;
            }
            ret = ret * 10 + cur;
            x = x / 10;
        }
        return ret * flag;
    }

    public static void main(String[] args) {
        System.out.println(new Q7().reverse(12345));
    }
}
