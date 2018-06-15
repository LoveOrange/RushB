package com.linsama.rushb;

import java.util.HashSet;
import java.util.Set;

public class Q3 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ret = 0, head = 0, tail = 0;
        while (head < n && tail < n) {
            if (!set.contains(s.charAt(tail))){
                set.add(s.charAt(tail++));
                ret = Math.max(ret, tail - head);
            } else {
                set.remove(s.charAt(head++));
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Q3 q3 = new Q3();
        System.out.println(q3.lengthOfLongestSubstring("abb"));
    }

}
