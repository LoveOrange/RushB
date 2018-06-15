package com.linsama.rushb;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class Q41 {
    public int firstMissingPositive(int[] nums) {
//        if (null == nums || nums.length == 0) {
//            return 1;
//        }
//        Set<Integer> numSet = new HashSet<>(nums.length + 1);
//        for (int num : nums) {
//            if (num > 0 && num < nums.length + 1) {
//                numSet.add(num);
//            }
//        }
//        for (int i = 1; i < numSet.size(); i++) {
//            if (!numSet.contains(i)) {
//                return i;
//            }
//        }
//        return numSet.size() + 1;
        BitSet bs = new BitSet(nums.length + 2);
        bs.set(0, true);
        for (int num : nums) {
            if (num > 0 && num < nums.length + 1) {
                bs.set(num, true);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Q41().firstMissingPositive(new int[] {1}));
    }
}
