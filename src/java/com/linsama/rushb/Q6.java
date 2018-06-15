package com.linsama.rushb;

public class Q6 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder("");
        int counter = 0;
        int magic = 2 * numRows - 2;
        int len = s.length();
        for (int i = 0; i < numRows; i++) {
            counter = 0;
            while(counter * magic + i < len) {
                if (i == 0 || i == numRows - 1) {
                    sb.append(s.charAt(i + counter * magic));
                } else {
                    sb.append(s.charAt(i + counter * magic));
                    if ((counter + 1) * magic - i < len) {
                        sb.append(s.charAt((counter + 1) * magic - i));
                    }
                }
                counter++;
            }
        }
        return sb.toString();
    }
}
