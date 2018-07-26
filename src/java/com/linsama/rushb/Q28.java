package com.linsama.rushb;

public class Q28 {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                return i;
            }
        }
        return -1;
    }
}
