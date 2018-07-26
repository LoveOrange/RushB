package com.linsama.rushb;

public class Q5 {
    public int longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder("#");
        for (char c : s.toCharArray()) {
            sb.append(c).append("#");
        }
        String str = sb.toString();
        int[] maxs = new int[str.length()];

        int id = 0;
        int right = 0;
        for (int i = 1; i < str.length(); i++) {
            if (right - i <= maxs[id]) {
                maxs[i] = maxs[id];
            } else {
                id = i;
                while (str.charAt(right++) == str.charAt(i * 2 - right)) {
                    maxs[i]++;
                }
                right--;
            }
        }

        int max = 0;
        boolean inString = false;
        for (int i = 0; i < str.length(); i++) {
            if (maxs[i] > max) {
                max = maxs[i];
                if (str.charAt(i) == '#') {
                    inString = false;
                } else {
                    inString = true;
                }
            }
        }
        return inString ? max * 2 - 1 : max * 2 - 2;
    }

    public static void main(String[] args) {

    }
}
