package com.linsama.rushb;

public class Q32 {
    public int longestValidParentheses(String s) {
        int maxLength = 0;
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i - 2 > 0 ? dp[i - 2] : 0) + 2;
                } else if (s.charAt(i - dp[i - 1]) > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + (i - dp[i - 1] > 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                if (dp[i] > maxLength) {
                    maxLength = dp[i];
                }
            }
        }
        return maxLength;
    }
}
