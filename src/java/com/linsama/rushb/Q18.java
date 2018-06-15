package com.linsama.rushb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        Map<Integer, List<List<Integer>>> twoSumMap = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (!twoSumMap.containsKey(nums[i] + nums[j])) {
                    twoSumMap.put(nums[i] + nums[j], new ArrayList<>());
                }
                twoSumMap.get(nums[i] + nums[j]).add(Arrays.asList(nums[i], nums[j]));
            }
        }
        Set<Integer> twoSumSet = twoSumMap.keySet();
        for (int num : twoSumSet) {
            if (twoSumSet.contains(target - num)) {
                // TODO
                for (List<Integer> halfList : twoSumMap.get(num)) {
                    for (List<Integer> another : twoSumMap.get(target - num)) {
                        halfList.addAll(another);
                        ret.add(halfList);
                    }
                }
                twoSumSet.remove(num);
                twoSumSet.remove(target - num);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,0,-1,0,-2,2};
        new Q18().fourSum(nums, 0);
    }
}
