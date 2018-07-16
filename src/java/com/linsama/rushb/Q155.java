package com.linsama.rushb;

import java.util.Stack;

public class Q155 {

    class MinStack {

        private Stack<Integer> container;
        private Stack<Integer> minStack;

        /** initialize your data structure here. */
        public MinStack() {
            this.container = new Stack<>();
            this.minStack = new Stack<>();
        }

        public void push(int x) {
            container.push(x);
            if (minStack.isEmpty() || x <= minStack.peek()) {
                minStack.push(x);
            }
        }

        public void pop() {
            if (container.pop().equals(minStack.peek())) {
                minStack.pop();
            }
        }

        public int top() {
            return container.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
