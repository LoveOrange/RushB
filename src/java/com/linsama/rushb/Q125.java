package com.linsama.rushb;

public class Q125 {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        for (int i = 0, j = lower.length() - 1; i < lower.length() && j >= 0; i++, j--) {
            while ((lower.charAt(i) < 'a' || lower.charAt(i) > 'z') && (lower.charAt(i) < '0' || lower.charAt(i) > '9') && i + 1 < lower.length()) i++;
            while ((lower.charAt(j) < 'a' || lower.charAt(j) > 'z') && (lower.charAt(j) < '0' || lower.charAt(j) > '9') && j - 1 >= 0) j--;
            if (i < j && lower.charAt(i) != lower.charAt(j)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(new Q125().isPalindrome("race a car"));
    }
}
