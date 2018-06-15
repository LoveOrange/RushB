package com.linsama.rushb;

import java.util.Stack;

public class Q84 {
    public int largestRectangleArea(int[] heights) {
        if (null == heights || heights.length == 0) {
            return 0;
        }
        if (heights.length == 1) {
            return heights[0];
        }
        int max = 0;
        int cur = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(heights[0]);
        for (int i = 1; i < heights.length; i++) {
            if (heights[stack.peek()] <= heights[i]) {
                stack.push(i);
            } else {
                while (heights[stack.peek()] > heights[i]) {
                    if ((i - stack.peek()) * heights[stack.peek()] > max) {
//                        max = i
                    }
                }
            }
        }
        return max;
    }
}
