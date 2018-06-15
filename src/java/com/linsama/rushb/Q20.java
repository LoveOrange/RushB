package com.linsama.rushb;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Q20 {
    public boolean isValid(String s) {
        Stack<Character> cs = new Stack<>();
        Map<Character, Character> cp = new HashMap<>();
        cp.put('(', ')');
        cp.put('{', '}');
        cp.put('[', ']');
        for (int i = 0; i < s.length(); i++) {
            if (cp.containsKey(s.charAt(i))) {
                cs.push(s.charAt(i));
            } else {
                if (cs.isEmpty()) {
                    return false;
                }
                if (!cp.get(cs.peek()).equals(s.charAt(i))) {
                    break;
                } else {
                    cs.pop();
                }
            }
        }
        if (cs.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
