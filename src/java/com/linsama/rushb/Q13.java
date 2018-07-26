package com.linsama.rushb;

import java.util.HashMap;
import java.util.Map;

public class Q13 {
    public int romanToInt(String s) {
        Map<Character, Integer> trans = new HashMap<>();
        trans.put('I', 1);
        trans.put('V', 5);
        trans.put('X', 10);
        trans.put('L', 50);
        trans.put('C', 100);
        trans.put('D', 500);
        trans.put('M', 1000);
        int cur = s.length() - 1;
        int ret = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (trans.get(s.charAt(i)) < trans.get(s.charAt(cur))) {
                ret -= trans.get(s.charAt(i));
            } else {
                ret += trans.get(s.charAt(i));
                cur = i;
            }
        }
        return ret;
    }
}
